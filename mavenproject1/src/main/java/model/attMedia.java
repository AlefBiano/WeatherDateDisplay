/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import presenter.attTela;
import presenter.mandaDados;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/**
 *
 * @author biano
 */
public class attMedia implements IObserver{
     private ArrayList<info> infoObservers;

    public attMedia() {
        infoObservers = new ArrayList<info>();
    }

    private int count;
    private float mediaTemperatura;
    private float mediaUmidade;
    private float mediaPressao;
    LocalDate date = LocalDate.now();
    private String dataAtual = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    private String[] dataSplit = dataAtual.split("/");

    public void update(info info) {
        infoObservers.add(info);

        mediaTemperatura = ((info.getTemperatura()) + mediaTemperatura);
        mediaUmidade = (info.getUmidade() + mediaUmidade);
        mediaPressao = (info.getPressao() + mediaPressao);
        count++;

        mediaTemperatura = mediaTemperatura / count;
        mediaUmidade = mediaUmidade / count;
        mediaPressao = mediaPressao / count;

        attTela.atualizarMedia(dataAtual, mediaTemperatura, mediaUmidade, mediaPressao);
        attTela.numeroLeituras(count);
    }    
}
