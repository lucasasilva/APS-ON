package br.com.apson.view;

import br.com.apson.controller.Controller;
import br.com.apson.util.getIDGenerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class CaixaSelecaoInternas {

    /*Função da caixa de seleção de cadastros
    Feito dessa forma para não ter que criar uma função para cada uma das telas;
    Como a gente só precisa do nome e do ID na maioria das vezes, a interface genérica é implementada
    e o valor da lista herda essa interface, ganhando acesso aos métodos que precisamos, independente da
    classe que está sendo retornada =D
    * */
    /*Movida para classe com método estático por:
     Já que a view das atividades está em uma classe separada, chamar essa funçaõ de dentro da classe FramePadrao causa
    um loop eterno por chamada recursiva, porque os objetos ficam se instanciando;
    Desta forma, posso chamar essa função onde eu quiser no nosso """"fronto"""
    Sem falar que diminui o código da outra classe torna mais legível;
    */
    public static Integer caixaSelecao(int valorLista){
        Controller controller = new Controller();
        JDialog caixaSeleca= new JDialog((Frame) null, "Cadastros", true);
        caixaSeleca.setLocation(600,300);
        caixaSeleca.setSize(300, 400);
        List<? extends getIDGenerico> listaDeCadastros = new ArrayList<>();
        if (valorLista ==1){
            listaDeCadastros = controller.retornaTodasInstituicoes();
        }
        if(valorLista ==2){
            listaDeCadastros = controller.retornaTodasAreas();
        }
        if (valorLista ==3){
            listaDeCadastros = controller.retornaTodosProfessores();
        }
        if (valorLista==4){
            listaDeCadastros = controller.retornaTodosAlunos();
        }

        String[] coluna = {"ID", "Nome"};
        String [][] dados = new String[listaDeCadastros.size()][2];

        for(int i=0; i<listaDeCadastros.size(); i++){
            dados[i][0] = String.valueOf(listaDeCadastros.get(i).getId());
            dados[i][1] = String.valueOf(listaDeCadastros.get(i).getNome());
        }
        JTable tabela = new JTable(dados, coluna);
        JScrollPane painel = new JScrollPane(tabela);
        caixaSeleca.add(painel);
        Integer[] idInstClicada = {null};
        tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1){
                    int linha = tabela.getSelectedRow();
                    idInstClicada[0] = Integer.parseInt((String)tabela.getValueAt(linha, 0));
                    caixaSeleca.dispose();
                }
            }
        });
        caixaSeleca.setVisible(true);
        return idInstClicada[0];
    }
}
