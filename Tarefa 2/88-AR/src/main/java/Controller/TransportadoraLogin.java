package controller;

import model.*;
import view.*;

import java.util.AbstractMap;
import java.util.Map;

public class TransportadoraLogin extends Login {
    public TransportadoraLogin(Controller controller) {
        super(controller);
    }

    private void login() {
        View v = new DefaultView();

        viewShow(v, Messages.ASKUSERNAME);
        String user = Input.readString();

        viewShow(v, "\n" + Messages.ASKPASSWORD);
        String password = Input.readString();

        boolean sucessLogin = super.validateLogin(user, password);

        if (sucessLogin && user.charAt(0) == 't') {
            super.setUsername(user);
        }
    }

    @Override
    public void run() {
        View v = new DefaultView();
        this.login();
        if (this.getUsername() == null) {
            viewShow(v, Messages.LOGINFAILED);
            return;
        }
        viewShow(v, Messages.SUCESSEFULLOGIN);
        String input = "";
        Transportadora donoDaSessao = this.sgv.getSpecificTransportadora(this.getUsername());
        while (!input.equalsIgnoreCase("exit")) {
            viewShow(v, Messages.ASKCOMMAND);
            input = Input.readString();
            switch (input.toLowerCase()) {
                case "sd0":
                case "set disponibilidade 0":
                    this.getChanges().firePropertyChange("transportadora_set_disponibilidade", true, false);
                    donoDaSessao.setDisponivel(false);
                    break;
                case "sd1":
                case "set disponibilidade 1":
                    this.getChanges().firePropertyChange("transportadora_set_disponibilidade", false, true);
                    donoDaSessao.setDisponivel(true);
                    break;
                case "exit":
                    viewShow(v, Messages.LOGOFF);
                    break;
                case "deliver":
                    this.enviaPedido(donoDaSessao);
                    break;
                case "cp":
                case "change password":
                    this.changePassword();
                    break;
                case "help":
                    viewShow(v, "Para mudar disponibilidade: set disponibilidade x (sdx) sendo x: 1 (disponivel) ou 0 (nao disponivel)\n"
                                + "Sair da sessao: exit\n"
                                + "Entregar o pedido mais pendente: deliver\n"
                                + "Mudar a Palavra-passe: change password (cp)\n");
                    break;
                default:
                    viewShow(v, Messages.INVALIDCOMMAND);
                    break;
            }
        }
    }

    private void viewShow(View v, String logoff) {
        v.show(logoff);
    }

    private void enviaPedido (Transportadora transportadora) {
        View v = new DefaultView();

        Map.Entry<Double , Encomenda> encomenda = transportadora.getEncomendasPorEntregar().poll();
        if (encomenda == null) {
            viewShow(v, "Não tens nenhuma encomenda para entregar.\n");
            return;
        }

        Double preco = encomenda.getKey() * transportadora.getPrecoKm();
        Map.Entry<Double , Encomenda> paraUtilizador = new AbstractMap.SimpleEntry<>(preco , encomenda.getValue());
        Utilizador utilizador = this.sgv.getSpecificUtilizador(encomenda.getValue().getCodUtilizador());

        String choice =  "";
        v.show("Distancia a percorrer: " + encomenda.getKey() + "\nPeso da encomenda: " + encomenda.getValue().getPeso() + "\n");
        while (choice.equals("")) {
            viewShow(v, "Insira 'aceito' ou insira 'recuso': ");
            choice = Input.readString();
            switch(choice){
                case "aceito":
                    utilizador.getEncomendasDeTransportadoras().add(paraUtilizador);
                    break;
                case "recuso":
                    redirecionamentoAutomatico(paraUtilizador.getValue());
                    break;
                default:
                    choice = "";
                    break;
            }
        }
    }
}
