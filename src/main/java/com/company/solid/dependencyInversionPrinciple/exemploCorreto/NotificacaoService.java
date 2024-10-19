package com.company.solid.dependencyInversionPrinciple.exemploCorreto;
public class NotificacaoService {

    private DisparaMensagem disparaMensagem;

    // Injeção de dependência pelo construtor
    public NotificacaoService(DisparaMensagem disparaMensagem) {
        this.disparaMensagem = disparaMensagem;
    }

    // Método para enviar notificações, sem depender de uma implementação específica
    public void enviarNotificacao(String mensagem) {
        disparaMensagem.enviarMensagem(mensagem);
    }
}
