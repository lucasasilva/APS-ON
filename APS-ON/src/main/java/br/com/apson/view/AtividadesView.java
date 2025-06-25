package br.com.apson.view;

import br.com.apson.controller.Controller;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import jakarta.persistence.JoinTable;
import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmCompositeKeyBasicAttributeType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DataTruncation;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class AtividadesView {
    Controller controller = new Controller();

    public  JInternalFrame atividades(){
        JInternalFrame atividades = new JInternalFrame("Cadastro de atividade", false, true, false);
        atividades.setLayout(new GridLayout(15,2));
        atividades.setSize(500,600);
        atividades.setLocation(650,250);
        atividades.add(new JLabel("Tipo Atividade"));
        String[] tipoAtividades = {"APS", "EST"};
        JComboBox<String> tipoAtividade = new JComboBox<>(tipoAtividades);
        atividades.add(tipoAtividade);

        atividades.add(new JLabel("Professor"));
        JTextField professor = new JTextField(1);
        professor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()==2){
                    Integer codProf = CaixaSelecaoInternas.caixaSelecao(3);
                    if (codProf != null){
                        professor.setText(String.valueOf(codProf));
                    }
                }
            }
        });
        atividades.add(professor);

        atividades.add(new JLabel("Instituicao Prestação"));
        JTextField instituicao = new JTextField(5);
        instituicao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()==2){
                    Integer codInst  = CaixaSelecaoInternas.caixaSelecao(1);
                    if (codInst != null){
                        instituicao.setText(String.valueOf(codInst));
                    }
                }
            }
        });
        atividades.add(instituicao);

        atividades.add(new JLabel("Area Prestacao"));
        JTextField area = new JTextField(5);
        area.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                    Integer areaAtiv = CaixaSelecaoInternas.caixaSelecao(2);
                    if(areaAtiv != null){
                        area.setText(String.valueOf(areaAtiv));
                    }
                }
            }
        });
        atividades.add(area);

        atividades.add(new JLabel("Quantidade vagas"));
        JTextField qtdVagas = new JTextField(5);
        atividades.add(qtdVagas);
        atividades.add(new JLabel("Quantidade Grupos"));
        JTextField qtdGrupos = new JTextField(5);
        atividades.add(qtdGrupos);

        atividades.add(new JLabel("Data Inicio"));
        JDateChooser dataInidicio = new JDateChooser();
        if(String.valueOf(tipoAtividade)== "EST"){
            dataInidicio.setEnabled(false);
        }
        atividades.add(dataInidicio);
        atividades.add(new JLabel("Data Fim"));
        JDateChooser dataFim = new JDateChooser();
        atividades.add(dataFim);

        atividades.add(new JSeparator());
        atividades.add(new JLabel("Periodo(s)"));
        JCheckBox primeiro = new JCheckBox("primeiro");
        JCheckBox segundo = new JCheckBox("segundo");
        JCheckBox terceiro = new JCheckBox("terceiro");
        JCheckBox quarto = new JCheckBox("quarto");
        JCheckBox quinto = new JCheckBox("quinto");
        JCheckBox sexto = new JCheckBox("sexto");
        JCheckBox setimo = new JCheckBox("setimo");
        JCheckBox oitavo = new JCheckBox("oitavo");
        atividades.add(primeiro); atividades.add(segundo);atividades.add(terceiro);atividades.add(quarto);
        atividades.add(quinto);atividades.add(sexto);atividades.add(setimo); atividades.add(oitavo);

        //por causa do campo tipo LocalDate
        SimpleDateFormat formataData = new SimpleDateFormat("yyyy-MM-dd");

        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(e->{
            try {
                controller.criarAtividade(String.valueOf(tipoAtividade.getSelectedItem()),
                        Integer.valueOf(area.getText()),
                        Integer.valueOf(instituicao.getText()),
                        Integer.valueOf(professor.getText()),
                        Integer.valueOf(qtdVagas.getText()),
                        Integer.valueOf(qtdGrupos.getText()),
                        dataInidicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        dataFim.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        periodosDisponiveis(primeiro, segundo, terceiro, quarto, quinto, sexto, setimo, oitavo));
                        JOptionPane.showMessageDialog(null, "Atividade salva com suce");
                        atividades.dispose();
            }catch(RuntimeException erro){
                JOptionPane.showMessageDialog(atividades, "erro ao salvaor", erro.getMessage(), JOptionPane.ERROR_MESSAGE);
            }

        });
        atividades.add(salvar);

        atividades.setVisible(true);
        return atividades;
    }


    //sim, isso aqui é horrível;
    public String periodosDisponiveis(JCheckBox primeiro, JCheckBox segundo, JCheckBox terceiro, JCheckBox quarto
            , JCheckBox quinto, JCheckBox sexto, JCheckBox setimo, JCheckBox oitavo){
        String periodos="";
        if (primeiro.isSelected()){
            periodos = periodos + "1,";
        }
        if(segundo.isSelected()){
            periodos = periodos + "2,";
        }
        if (terceiro.isSelected()){
            periodos = periodos + "3,";
        }
        if (quarto.isSelected()){
            periodos = periodos + "4,";
        }
        if (quinto.isSelected()){
            periodos = periodos + "5,";
        }
        if (sexto.isSelected()){
            periodos = periodos + "6,";
        }
        if (setimo.isSelected()){
            periodos = periodos + "7,";
        }
        if (oitavo.isSelected()){
            periodos = periodos + "8";
        }
        return periodos;
    }

}
