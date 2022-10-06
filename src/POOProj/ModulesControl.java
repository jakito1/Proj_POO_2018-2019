/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOProj;

/**
 *
 * @author eufra
 */
public class ModulesControl {
    InputReader input;

    public ModulesControl() {
        input = new InputReader();
    }
    
    
    public String showOptions(){
        return ("Indique o que pretende verificar abaixo. Os resultados serão impressos no fim:\n\n"
                + "1 – Medir a tensão arterial\n"
                + "2 – Medir peso e altura e obter o IMC (Índice de Massa Corporal)\n"
                + "3 – Medir o perímetro abdominal\n"
                + "4 – Medir a pressão ocular\n"
                + "5 – Medir os batimentos cardíacos e o nível de oxigénio no sangue\n"
                + "6 – Estimar a temperatura corporal\n"
                + "7 – Fazer o diagnóstico de acuidade auditiva\n"
                + "8 – Fazer o diagnóstico da visão\n"
                + "9 – Fazer todos os testes\n\n"
                + "0 – Imprimir os resultados e terminar");
    }
    
    public boolean isValidOption(){
        int opt = input.getIntegerNumber("Opção");
        return opt < 10 && opt >= 0;
    }
    
}
