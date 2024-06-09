package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        DeskJet deskjet = new DeskJet();
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
