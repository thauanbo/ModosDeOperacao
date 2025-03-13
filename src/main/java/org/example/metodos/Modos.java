package org.example.metodos;

public class Modos extends Sistema{
    //Atributos Private, trazendo segurança ao Sistema
    private String usuario;

    //construtor
    public Modos() {
        this.usuario = "usuario";
    }
    //Metodos get - set nao utilizados por erro com os operados logicos
//    private String getUsuario() {
//        return usuario;
//    }
//
//    private void setUsuario(String usuario) {
//        this.usuario = usuario;
//    }

    //Metodos
    @Override
    public void ligar() {
        if (usuario.equals("usuario")) {
            System.out.println("Ligando como usuário...");
        } else {
            System.out.println("Ligando com autorizacao kernel...");
        }
    }

    @Override
    public void desligar() {
        if (usuario.equals("usuario") || usuario.equals("kernel")) {
            System.out.println("Desligando...");
        }
    }

    @Override
    public void abriMenu() {
        if (usuario.equals("usuario") || usuario.equals("kernel")) {
            System.out.println("Abrindo menu...");
        }
    }

    @Override
    public void fecharMenu() {
        if (usuario.equals("usuario") || usuario.equals("kernel")) {
            System.out.println("Fechando menu...");
        }
    }

    //implementacao alterarModo foi realizado com ajuda do chatgpt na troca por operador ternario
    @Override
    public void alterarModo() {
        usuario = usuario.equals("kernel") ? "usuario" : "kernel";
        System.out.println("Modo alterado para: " + usuario);
    }


    @Override
    public void modo() {
        System.out.println("Modo atual: " + usuario);
    }

    //implementacao criarProcesso usado com logica ELSE IF
    @Override
    public void criarProcesso() {
        if (usuario.equals("kernel")) {
            System.out.println("Criando processo...");
        } else if (usuario.equals("usuario")) {
            System.out.println("Acesso Negado ao Usuario");
            usuario = "kernel";
            System.out.println("Modo alterado para: " + usuario);
            criarProcesso();
        } else {
            System.out.println("Acesso Negado.....");
        }
    }
}