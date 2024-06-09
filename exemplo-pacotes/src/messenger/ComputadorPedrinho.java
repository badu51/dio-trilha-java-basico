package messenger;

import messenger.apps.FacebookMessenger;
import messenger.apps.MSNMessenger;
import messenger.apps.ServicoMensagemInstantanea;
import messenger.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido="fbm";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();

        /*MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("MSN");

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        System.out.println("Facebook");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        System.out.println("Telegram");*/
    }
}
