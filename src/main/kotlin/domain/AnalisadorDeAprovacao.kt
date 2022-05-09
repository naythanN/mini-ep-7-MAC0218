package domain

import domain.criterios.Basico
import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

    private lateinit var meuCriterio : CriterioDeAprovacao;
    fun defineCriterio(criterioDeAprovacao : CriterioDeAprovacao){
        meuCriterio = criterioDeAprovacao;
    }

    fun fechaBoletim(boletim : Boletim) : BoletimFechado{
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, meuCriterio.mediaFinal(boletim), meuCriterio.estaAprovado(boletim));
    }

}