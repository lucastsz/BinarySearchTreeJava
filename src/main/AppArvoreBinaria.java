package main;

import model.ArvoreBinaria;

public class AppArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();
        ArvoreBinaria nova = new ArvoreBinaria();
        
    
        
 //M.E 1
        a.inserirI(50);
        a.inserirI(3);
        a.inserirI(70);
        a.inserirI(2);
        a.inserirI(4);
        a.inserirI(8);
        a.inserirI(6);
        a.inserirI(9);
        
        System.out.println("IMPRIMIR ARVORE:");
        a.imprimir();
        
        /*
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("ORIGINAL:\n");
        System.out.println("NÓ IN ORDEM");
        a.inOrdem();
        System.out.println("NÓ PRE ORDEM");
        a.preOrdem();
        System.out.println("NÓ POS ORDEM");
        a.posOrdem();
        System.out.println("----------------------------------------------------\n");
        nova = new ArvoreBinaria();
        System.out.println("a) INSERINDO LISTA POS ORDEM");
        for (int i = 0; i < a.getListaPosOrdem().size(); i++) {
            nova.inserirI(a.getListaPosOrdem().get(i).dado);
        }

        System.out.println("Percurso preOrdem:");nova.preOrdem();
        System.out.println("Percurso InOrdem:");nova.inOrdem();
        System.out.println("Percurso posOrdem:");nova.posOrdem();
        
        System.out.println("\n\n");
        nova = new ArvoreBinaria();
        System.out.println("b) INSERINDO LISTA PRE ORDEM");
        for (int i = 0; i < a.getListaPreOrdem().size(); i++) {
            nova.inserirI(a.getListaPreOrdem().get(i).dado);
        }

        System.out.println("Percurso preOrdem:");nova.preOrdem();
        System.out.println("Percurso InOrdem:");nova.inOrdem();
        System.out.println("Percurso posOrdem:");nova.posOrdem();
       

        
               System.out.println("\n\n"); 
        System.out.println("c) INSERINDO LISTA IN ORDEM");
        for (int i = 0; i < a.getListaInOrdem().size(); i++) {
            nova.inserirI(a.getListaInOrdem().get(i).dado);
        }

        System.out.println("Percurso preOrdem:");nova.preOrdem();
        System.out.println("Percurso InOrdem:");nova.inOrdem();
        System.out.println("Percurso posOrdem:");nova.posOrdem();
       
        System.out.println("\n----------------------------------------------------\n2º)");
        System.out.println("Soma dos valores da árvore:\nR: "+a.soma());
        System.out.println("Quantidade de elementos da árvore:\nR: "+a.totalElementos());
        System.out.println("Média dos valores da árvore:\nR: " + a.mediaElementos());
          System.out.println("----------------------------------------------------");
        System.out.println("\n2º) Menores valores da árvore (LADO ESQUERDO):");
        a.menor();
        System.out.println("\n2º) Menores valores da árvore (MEDIA DOS ELMENTOS DA ÁRVORE):");
        a.menorMediaArvore();
        System.out.println("\n3º) A árvore é estritamente binária?");
        a.estritamenteBinaria();
        System.out.println("\n4º) Imprima os nós pais e o nó de maior valor referente ao seu filho:");
        a.NoPaiMaiorFilho();
        
        
        
        /*
        ------------------------------------------------------------
        
         INSERT NA ARVORE DO EXERCICIO 
        a.inserirI(45);
        a.inserirI(30);
        a.inserirI(20);
        a.inserirI(10);
        a.inserirI(25);
        a.inserirI(27);
        a.inserirI(40);
        a.inserirI(35);
        a.inserirI(42);
        a.inserirI(60);
        a.inserirI(50);
        a.inserirI(49);
        a.inserirI(52);
        a.inserirI(75);
        a.inserirI(70);
        a.inserirI(80);
 
        
        
        
        System.out.println("IMPRIMIR PÓS-ORDEM (LRN): ");
        a.posOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR PRÉ-ORDEM (NLR): ");
        a.preOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR IN-ORDEM (LNR): ");
        a.inOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR IN-ORDEM INVERSA: ");
        a.inOrdemInversa();
        
        
        System.out.println("_________________________________________________\n");
        System.out.println("[GRAUS DE CADA NÓ]");
        
        
        System.out.println("- NÓ RAIZ ---------------- " + (a.grauNo(a.valorRaiz())));
        System.out.println("- NÓ [80] ---------------- " + (a.grauNo(80)));
        
        System.out.println("_________________________________________________\n");
        System.out.println("[ALTURA DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + (a.altura(a.valorRaiz()) - 1));
        System.out.println("- NÓ [80] ---------------- " + (a.altura(80) - 1));
        System.out.println("");
        
        System.out.println("_________________________________________________\n");
        System.out.println("[PROFUNDIDADE DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + a.profundidadeNo(a.valorRaiz()));
        System.out.println("- NÓ [80] ---------------- " + a.profundidadeNo(80));
        System.out.println("");
        
        System.out.println("_________________________________________________\n");
        System.out.println("[NÍVEIS DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + a.nivelNo(a.valorRaiz()));
        System.out.println("- NÓ [80] ---------------- " + a.nivelNo(80));
        System.out.println("");
        
        System.out.println("_________________________________________________\n");
        System.out.println("[SUBARVORES DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + a.subArvores(a.valorRaiz()));
        System.out.println("- NÓ [80] ---------------- " + a.subArvores(80));
        System.out.println("");
        
-------------------------------------------------------------------------------------------
       outra árvore
        
       a.inserirI(50);
       a.inserirI(45);
       a.inserirI(46);
       a.inserirI(35);
       a.inserirI(15);
       a.inserirI(40);
       a.inserirI(38);
       a.inserirI(42);
       a.inserirI(43);
       a.inserirI(36);
       a.inserirI(5);
       a.inserirI(65);
       a.inserirI(75);
       a.inserirI(70);
       a.inserirI(85);
 
        
        
        System.out.println("IMPRIMIR PÓS-ORDEM (LRN): ");
        a.posOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR PRÉ-ORDEM (NLR): ");
        a.preOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR IN-ORDEM (LNR): ");
        a.inOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR IN-ORDEM INVERSA: ");
        a.inOrdemInversa();
        
        
        System.out.println("_________________________________________________\n");
        System.out.println("[GRAUS DE CADA NÓ]");
        
        
        System.out.println("- NÓ RAIZ ---------------- " + (a.grauNo(a.valorRaiz())));
        System.out.println("- NÓ [15] ---------------- " + (a.grauNo(15)));
        System.out.println("- NÓ [43] ---------------- " + (a.grauNo(43)));
        
        System.out.println("_________________________________________________\n");
        System.out.println("[ALTURA DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + (a.altura(a.valorRaiz()) - 1));
        System.out.println("- NÓ [40] ---------------- " + (a.altura(40) - 1));
        System.out.println("- NÓ [45] ---------------- " + (a.altura(45) - 1));
        System.out.println("- NÓ [70] ---------------- " + (a.altura(70) - 1));
        System.out.println("");
        
        System.out.println("_________________________________________________\n");
        System.out.println("[PROFUNDIDADE DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + a.profundidadeNo(a.valorRaiz()));
        System.out.println("- NÓ [40] ---------------- " + a.profundidadeNo(40));
        System.out.println("- NÓ [36] ---------------- " + a.profundidadeNo(36));
        System.out.println("- NÓ [5]  ---------------- " + a.profundidadeNo(5));
        System.out.println("- NÓ [85] ---------------- " + a.profundidadeNo(85));
        System.out.println("");
        
        System.out.println("_________________________________________________\n");
        System.out.println("[NÍVEIS DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + a.nivelNo(a.valorRaiz()));
        System.out.println("- NÓ [45] ---------------- " + a.nivelNo(45));
        System.out.println("- NÓ [75] ---------------- " + a.nivelNo(75));
        System.out.println("- NÓ [15] ---------------- " + a.nivelNo(15));
        System.out.println("- NÓ [42] ---------------- " + a.nivelNo(42));
        System.out.println("- NÓ [36] ---------------- " + a.nivelNo(36));
        System.out.println("");
        
        System.out.println("_________________________________________________\n");
        System.out.println("[SUBARVORES DE CADA NÓ]");
        System.out.println("- NÓ RAIZ ---------------- " + a.subArvores(a.valorRaiz()));
        System.out.println("- NÓ [15] ---------------- " + a.subArvores(15));
        System.out.println("- NÓ [43] ---------------- " + a.subArvores(43));
        System.out.println("");


        //System.out.println("_________________________________________________\n");
        //a.AlterarLadosArvore();
        //System.out.println("Raiz: " + a.subArvores(a.valorRaiz()));
        
        System.out.println("IMPRIMIR PÓS-ORDEM (LRN): ");
        a.posOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR PRÉ-ORDEM (NLR): ");
        a.preOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR IN-ORDEM (LNR): ");
        a.inOrdem();
        System.out.println("");
        
        System.out.println("IMPRIMIR IN-ORDEM INVERSA: ");
        a.inOrdemInversa();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
   
        
        //M.E 1
        a.inserirI(30);
        a.inserirI(15);
        a.inserirI(10);
        a.inserirI(8);
        a.inserirI(12);
        a.inserirI(20);
        a.inserirI(26);
        a.inserirI(40);
        a.inserirI(32);
        a.inserirI(31);
        a.inserirI(60);
        a.inserirI(59);
        a.inserirI(75);
        
        System.out.println("a) Imprima a árvore binária no percurso pré-ordem: ");
        a.preOrdem();
        System.out.println("b) Imprima a árvore binária no percurso in-ordem: ");
        a.inOrdem();
        System.out.println("c) Imprima a árvore binária no percurso pós-ordem: ");
        a.posOrdem();
        System.out.println("d) Determine o Grau de cada nó: ");
        System.out.println("-Nó 30: " + a.grauNo(30));
        System.out.println("-Nó 15: " + a.grauNo(15));
        System.out.println("-Nó 10: " + a.grauNo(10));
        System.out.println("-Nó 8:  " + a.grauNo(8));
        System.out.println("-Nó 12: " + a.grauNo(12));
        System.out.println("-Nó 20: " + a.grauNo(20));
        System.out.println("-Nó 26: " + a.grauNo(26));
        System.out.println("-Nó 40: " + a.grauNo(40));
        System.out.println("-Nó 32: " + a.grauNo(32));
        System.out.println("-Nó 31: " + a.grauNo(31));
        System.out.println("-Nó 60: " + a.grauNo(60));
        System.out.println("-Nó 59: " + a.grauNo(59));
        System.out.println("-Nó 75: " + a.grauNo(75));
        System.out.println("e) Determine o nível de cada nó: ");
        System.out.println("-Nó 30: " + a.nivelNo(30));
        System.out.println("-Nó 15: " + a.nivelNo(15));
        System.out.println("-Nó 10: " + a.nivelNo(10));
        System.out.println("-Nó 8:  " + a.nivelNo(8));
        System.out.println("-Nó 12: " + a.nivelNo(12));
        System.out.println("-Nó 20: " + a.nivelNo(20));
        System.out.println("-Nó 26: " + a.nivelNo(26));
        System.out.println("-Nó 40: " + a.nivelNo(40));
        System.out.println("-Nó 32: " + a.nivelNo(32));
        System.out.println("-Nó 31: " + a.nivelNo(31));
        System.out.println("-Nó 60: " + a.nivelNo(60));
        System.out.println("-Nó 59: " + a.nivelNo(59));
        System.out.println("-Nó 75: " + a.nivelNo(75));
        System.out.println("f) Determine a profundidade de cada nó: ");
        System.out.println("-Nó 30: " + a.profundidadeNo(30));
        System.out.println("-Nó 15: " + a.profundidadeNo(15));
        System.out.println("-Nó 10: " + a.profundidadeNo(10));
        System.out.println("-Nó 8:  " + a.profundidadeNo(8));
        System.out.println("-Nó 12: " + a.profundidadeNo(12));
        System.out.println("-Nó 20: " + a.profundidadeNo(20));
        System.out.println("-Nó 26: " + a.profundidadeNo(26));
        System.out.println("-Nó 40: " + a.profundidadeNo(40));
        System.out.println("-Nó 32: " + a.profundidadeNo(32));
        System.out.println("-Nó 31: " + a.profundidadeNo(31));
        System.out.println("-Nó 60: " + a.profundidadeNo(60));
        System.out.println("-Nó 59: " + a.profundidadeNo(59));
        System.out.println("-Nó 75: " + a.profundidadeNo(75));
        System.out.println("f) Determine a altura de cada nó: ");
        System.out.println("-Nó 30: " + a.altura(30));
        System.out.println("-Nó 15: " + a.altura(15));
        System.out.println("-Nó 10: " + a.altura(10));
        System.out.println("-Nó 8:  " + a.altura(8));
        System.out.println("-Nó 12: " + a.altura(12));
        System.out.println("-Nó 20: " + a.altura(20));
        System.out.println("-Nó 26: " + a.altura(26));
        System.out.println("-Nó 40: " + a.altura(40));
        System.out.println("-Nó 32: " + a.altura(32));
        System.out.println("-Nó 31: " + a.altura(31));
        System.out.println("-Nó 60: " + a.altura(60));
        System.out.println("-Nó 59: " + a.altura(59));
        System.out.println("-Nó 75: " + a.altura(75));
        

        ---------------------------------------------------------------
 
        //M.E 2
        a.inserirI(100);
        a.inserirI(76);
        a.inserirI(60);
        a.inserirI(32);
        a.inserirI(75);
        a.inserirI(90);
        a.inserirI(140);
        a.inserirI(120);
        a.inserirI(200);
        a.inserirI(220);
        
        System.out.println("a) Imprima a árvore binária no percurso pré-ordem: ");
        a.preOrdem();
        System.out.println("b) Imprima a árvore binária no percurso in-ordem: ");
        a.inOrdem();
        System.out.println("c) Imprima a árvore binária no percurso pós-ordem: ");
        a.posOrdem();
        System.out.println("d) Determine o Grau de cada nó: ");
        System.out.println("-Nó 100: " + a.grauNo(100));
        System.out.println("-Nó 76: " + a.grauNo(76));
        System.out.println("-Nó 60: " + a.grauNo(60));
        System.out.println("-Nó 32: " + a.grauNo(32));
        System.out.println("-Nó 75: " + a.grauNo(75));
        System.out.println("-Nó 90: " + a.grauNo(90));
        System.out.println("-Nó 140: " + a.grauNo(140));
        System.out.println("-Nó 120: " + a.grauNo(120));
        System.out.println("-Nó 200: " + a.grauNo(200));
        System.out.println("-Nó 220: " + a.grauNo(220));
        
        System.out.println("e) Determine o nível de cada nó: ");
        System.out.println("-Nó 100: " + a.nivelNo(100));
        System.out.println("-Nó 76: " + a.nivelNo(76));
        System.out.println("-Nó 60: " + a.nivelNo(60));
        System.out.println("-Nó 32: " + a.nivelNo(32));
        System.out.println("-Nó 75: " + a.nivelNo(75));
        System.out.println("-Nó 90: " + a.nivelNo(90));
        System.out.println("-Nó 140: " + a.nivelNo(140));
        System.out.println("-Nó 120: " + a.nivelNo(120));
        System.out.println("-Nó 200: " + a.nivelNo(200));
        System.out.println("-Nó 220: " + a.nivelNo(220));
        System.out.println("f) Determine a profundidade de cada nó: ");
        System.out.println("-Nó 100: " + a.profundidadeNo(100));
        System.out.println("-Nó 76: " + a.profundidadeNo(76));
        System.out.println("-Nó 60: " + a.profundidadeNo(60));
        System.out.println("-Nó 32: " + a.profundidadeNo(32));
        System.out.println("-Nó 75: " + a.profundidadeNo(75));
        System.out.println("-Nó 90: " + a.profundidadeNo(90));
        System.out.println("-Nó 140: " + a.profundidadeNo(140));
        System.out.println("-Nó 120: " + a.profundidadeNo(120));
        System.out.println("-Nó 200: " + a.profundidadeNo(200));
        System.out.println("-Nó 220: " + a.profundidadeNo(220));
        System.out.println("f) Determine a altura de cada nó: ");
        System.out.println("-Nó 100: " + a.altura(100));
        System.out.println("-Nó 76: " + a.altura(76));
        System.out.println("-Nó 60: " + a.altura(60));
        System.out.println("-Nó 32: " + a.altura(32));
        System.out.println("-Nó 75: " + a.altura(75));
        System.out.println("-Nó 90: " + a.altura(90));
        System.out.println("-Nó 140: " + a.altura(140));
        System.out.println("-Nó 120: " + a.altura(120));
        System.out.println("-Nó 200: " + a.altura(200));
        System.out.println("-Nó 220: " + a.altura(220));

 
        ---------------------------------------------------------------
        //M.E 3
         a.inserirI(300);
         a.inserirI(280);
         a.inserirI(2);
         a.inserirI(1);
         a.inserirI(299);
         a.inserirI(305);
         a.inserirI(302);
         a.inserirI(475);
         a.inserirI(472);
         a.inserirI(476);
        
        System.out.println("a) Imprima a árvore binária no percurso pré-ordem: ");
        a.preOrdem();
        System.out.println("b) Imprima a árvore binária no percurso in-ordem: ");
        a.inOrdem();
        System.out.println("c) Imprima a árvore binária no percurso pós-ordem: ");
        a.posOrdem();
        System.out.println("d) Determine o Grau de cada nó: ");
        System.out.println("-Nó 300: " + a.grauNo(300));
        System.out.println("-Nó 280: " + a.grauNo(280));
        System.out.println("-Nó 2: "   + a.grauNo(2));
        System.out.println("-Nó 1: "   + a.grauNo(1));
        System.out.println("-Nó 299: " + a.grauNo(299));
        System.out.println("-Nó 305: " + a.grauNo(305));
        System.out.println("-Nó 302: " + a.grauNo(302));
        System.out.println("-Nó 475: " + a.grauNo(475));
        System.out.println("-Nó 472: " + a.grauNo(472));
        System.out.println("-Nó 476: " + a.grauNo(476));
        
        System.out.println("e) Determine o nível de cada nó: ");
        System.out.println("-Nó 300: " + a.nivelNo(300));
        System.out.println("-Nó 280: " + a.nivelNo(280));
        System.out.println("-Nó 2: "   + a.nivelNo(2));
        System.out.println("-Nó 1: "   + a.nivelNo(1));
        System.out.println("-Nó 299: " + a.nivelNo(299));
        System.out.println("-Nó 305: " + a.nivelNo(305));
        System.out.println("-Nó 302: " + a.nivelNo(302));
        System.out.println("-Nó 475: " + a.nivelNo(475));
        System.out.println("-Nó 472: " + a.nivelNo(472));
        System.out.println("-Nó 476: " + a.nivelNo(476));
        System.out.println("f) Determine a profundidade de cada nó: ");
        System.out.println("-Nó 300: " + a.profundidadeNo(300));
        System.out.println("-Nó 280: " + a.profundidadeNo(280));
        System.out.println("-Nó 2: "   + a.profundidadeNo(2));
        System.out.println("-Nó 1: "   + a.profundidadeNo(1));
        System.out.println("-Nó 299: " + a.profundidadeNo(299));
        System.out.println("-Nó 305: " + a.profundidadeNo(305));
        System.out.println("-Nó 302: " + a.profundidadeNo(302));
        System.out.println("-Nó 475: " + a.profundidadeNo(475));
        System.out.println("-Nó 472: " + a.profundidadeNo(472));
        System.out.println("-Nó 476: " + a.profundidadeNo(476));
        System.out.println("f) Determine a altura de cada nó: ");
        System.out.println("-Nó 300: " + a.altura(300));
        System.out.println("-Nó 280: " + a.altura(280));
        System.out.println("-Nó 2: "   + a.altura(2));
        System.out.println("-Nó 1: "   + a.altura(1));
        System.out.println("-Nó 299: " + a.altura(299));
        System.out.println("-Nó 305: " + a.altura(305));
        System.out.println("-Nó 302: " + a.altura(302));
        System.out.println("-Nó 475: " + a.altura(475));
        System.out.println("-Nó 472: " + a.altura(472));
        System.out.println("-Nó 476: " + a.altura(476));


        
        a.inserirI(752);
        a.inserirI(70);
        a.inserirI(60);
        a.inserirI(59);
        a.inserirI(61);
        a.inserirI(80);
        a.inserirI(756);
        a.inserirI(754);
        a.inserirI(800);
        a.inserirI(900);
        
        System.out.println("a) Imprima a árvore binária no percurso pré-ordem: ");
        a.preOrdem();
        System.out.println("b) Imprima a árvore binária no percurso in-ordem: ");
        a.inOrdem();
        System.out.println("c) Imprima a árvore binária no percurso pós-ordem: ");
        a.posOrdem();
        System.out.println("d) Determine o Grau de cada nó: ");
        System.out.println("-Nó 752: " + a.grauNo(752));
        System.out.println("-Nó 70: "  + a.grauNo(70));
        System.out.println("-Nó 60: "    + a.grauNo(60));
        System.out.println("-Nó 59: "    + a.grauNo(59));
        System.out.println("-Nó 61: "  + a.grauNo(61));
        System.out.println("-Nó 80: "  + a.grauNo(80));
        System.out.println("-Nó 756: " + a.grauNo(756));
        System.out.println("-Nó 754: " + a.grauNo(754));
        System.out.println("-Nó 800: " + a.grauNo(800));
        System.out.println("-Nó 900: " + a.grauNo(900));
        
        System.out.println("e) Determine o nível de cada nó: ");
        System.out.println("-Nó 752: " + a.nivelNo(752));
        System.out.println("-Nó 70: "  + a.nivelNo(70));
        System.out.println("-Nó 60: "    + a.nivelNo(60));
        System.out.println("-Nó 59: "    + a.nivelNo(59));
        System.out.println("-Nó 61: "  + a.nivelNo(61));
        System.out.println("-Nó 80: "  + a.nivelNo(80));
        System.out.println("-Nó 756: " + a.nivelNo(756));
        System.out.println("-Nó 754: " + a.nivelNo(754));
        System.out.println("-Nó 800: " + a.nivelNo(800));
        System.out.println("-Nó 900: " + a.nivelNo(900));
        System.out.println("f) Determine a profundidade de cada nó: ");
        System.out.println("-Nó 752: " + a.profundidadeNo(752));
        System.out.println("-Nó 70: "  + a.profundidadeNo(70));
        System.out.println("-Nó 60: "    + a.profundidadeNo(60));
        System.out.println("-Nó 59: "    + a.profundidadeNo(59));
        System.out.println("-Nó 61: "  + a.profundidadeNo(61));
        System.out.println("-Nó 80: "  + a.profundidadeNo(80));
        System.out.println("-Nó 756: " + a.profundidadeNo(756));
        System.out.println("-Nó 754: " + a.profundidadeNo(754));
        System.out.println("-Nó 800: " + a.profundidadeNo(800));
        System.out.println("-Nó 900: " + a.profundidadeNo(900));
        System.out.println("f) Determine a altura de cada nó: ");
        System.out.println("-Nó 752: " + a.altura(752));
        System.out.println("-Nó 70: "  + a.altura(70));
        System.out.println("-Nó 60: "    + a.altura(60));
        System.out.println("-Nó 59: "    + a.altura(59));
        System.out.println("-Nó 61: "  + a.altura(61));
        System.out.println("-Nó 80: "  + a.altura(80));
        System.out.println("-Nó 756: " + a.altura(756));
        System.out.println("-Nó 754: " + a.altura(754));
        System.out.println("-Nó 800: " + a.altura(800));
        System.out.println("-Nó 900: " + a.altura(900));

       
        
        a.inserirI(45);
        a.inserirI(30);
        a.inserirI(20);
        a.inserirI(10);
        a.inserirI(25);
        a.inserirI(27);
        a.inserirI(40);
        a.inserirI(35);
        a.inserirI(42);
        a.inserirI(60);
        a.inserirI(50);
        a.inserirI(49);
        a.inserirI(52);
        a.inserirI(75);
        a.inserirI(70);
        a.inserirI(80);
        
       System.out.println("a) Imprima a árvore binária no percurso pré-ordem: ");
        a.preOrdem();
        System.out.println("b) Imprima a árvore binária no percurso in-ordem: ");
        a.inOrdem();
        System.out.println("c) Imprima a árvore binária no percurso pós-ordem: ");
        a.posOrdem();
        
        */
        
     
    }
}
