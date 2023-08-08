package org.example;

import model_Pessoa.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //01 e 02 Crie um ArrayList vazio de Strings e imprima o ArrayList.
    public static void imprimeLista(List<String> list) {
        for (String nome : list) {
            System.out.println(nome);
        }
    }

    //01 e 02 Crie um ArrayList de Pessoas e imprima o nome delas em ordem alfabética
    public static void imprimePessoas(List<Pessoa> pessoas) {
        pessoas.stream().sorted(Comparator.comparing(Pessoa::getNome)).forEach(System.out::println);
    }

    //Exercício 1: Filtrar números pares
    //Dado um array de números inteiros, use streams e lambda para filtrar apenas os números pares.
    public static List<Integer> filtrar(List<Integer> todos) {
        return todos.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
    }

    //03  Imprima o número de elementos no ArrayList. ?
    public static void numeroDeElementos(List<Integer> valores) {
        System.out.println("O tamanho da lista é: " + valores.size());
    }

    //04 Recupere o terceiro elemento do ArrayList. ?
    public static void recuperaElemento(List<Integer> elementoRecuperado) {

        System.out.println("O terceiro elemento do ArrayList é: " + elementoRecuperado.get(2));
    }

    //05  Atualize o segundo elemento do ArrayList para um novo valor. ?
    public static void elementoNovo(List<Integer> NovoElemento) {

        NovoElemento.set(2, 10);
        System.out.println("Segundo elemento atualizado para o numero: " + NovoElemento);
    }

    //06 Remova o último elemento do ArrayList. ?
    public static void removeElemento(List<Integer> elementoRemovido, int id) {
        elementoRemovido.remove(id);
        System.out.println("Lista Atualizada apos Remoçao do Elemento: " + elementoRemovido);
    }

    //07   Verifique se um elemento específico está presente no ArrayList. ?
    public static void verificacaoDeElemento(List<Integer> elementoVerificado, int id) {

        if (elementoVerificado.contains(id)) {
            System.out.println("O elemento: " + id + " se encontra na lista");
        } else {
            System.out.println("O elemento: " + id + " não se encontra na lista");
        }
    }

    //08 Clone o ArrayList criado para um novo ArrayList e imprima-o. ?
    public static void arrayListClonado(List<Integer> elementoaSerClonado) {

        List listClone = new ArrayList<>(elementoaSerClonado);
        System.out.println("ArrayList Clonado: " + listClone + " com sucesso");

    }

    //09 Converta o ArrayList em um array regular e imprima esse array. ?
    public static void converteArrayLisRegular(List<Integer> elementoaSerConvertido) {

        Integer[] listClone = elementoaSerConvertido.toArray(new Integer[5]);
        System.out.println("ArrayList Clonado: " + Arrays.toString(listClone) + " com sucesso");

    }

    //10 Verifique se o ArrayList está vazio. ?
        public static void verificaArrayvazio(List<Integer> elementovazio) {

        if (elementovazio.size()==0) {
            System.out.println("A lista esta vazia !!!");
        } else {
            System.out.println("A lista com tem elementos: "+ elementovazio);
        }
    }


    public static void main(String[] args) {

//        ArrayList<String> lista = new ArrayList<>(List.of("adavilson","onias","luciano"));
//        imprimeLista(lista);


//        ArrayList<Pessoa> listaNova= new ArrayList<>(List.of(new Pessoa(1,"lemes",21),new Pessoa(2,"rocha",26)));
//        imprimePessoas(listaNova);


//        filtrar(List.of(1, 2, 3, 4, 5, 6, 7)).forEach(System.out::println);


//        List<Integer> listaElementos = List.of(10, 20, 30, 40, 50);
//        numeroDeElementos(listaElementos);

//        List<Integer> listaNumeros = List.of(10, 20, 30, 40, 50);
//        recuperaElemento(listaNumeros);

//        List<Integer> listaElementos = new ArrayList<>(List.of(10, 20, 30, 40, 50));
//        elementoNovo(listaElementos);


//        List<Integer> elementoASerRemovido = new ArrayList<>(List.of(2, 8, 15, 20, 30));
//        removeElemento(elementoASerRemovido,0);

//        List<Integer> ElementoAServerificado = new ArrayList<>(List.of(10, 20, 35, 40, 100));
//        verificacaoDeElemento(ElementoAServerificado, 80);

//        List<Integer> listaClonadaAtual = new ArrayList<>(List.of(10, 20, 30));
//        arrayListClonado(listaClonadaAtual);

//        List<Integer> listaArryRegular = new ArrayList<>(List.of(10, 20, 30, 40, 50));
//        converteArrayLisRegular(listaArryRegular);

//        List<Integer> listaArryRegular = new ArrayList<>(List.of(2,3));
//        verificaArrayvazio(listaArryRegular);


    }

}