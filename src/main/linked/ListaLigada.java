package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    
    private No cabeca;

    public ListaLigada() {
          
    }

    @Override
    public boolean buscaElemento(int valor) {
        
    }

    @Override
    public int buscaIndice(int valor) {
        No atual = new No(valor);
        int minvalor = cabeca.getValor();
         int minIndex = 0;
        int atualIndex = 0; 
        while (atual != null) {
           if (atual.valor < minvalor) {
                minvalor = atual.valor;
                minIndex = atualIndex + 1;
            }  
           atual = atual.getProximo();
           atualIndex++;
        }
    }

    @Override
    public int minimo() {
       int minvalor = cabeca.getValor();
       No n = cabeca.getProximo();

       while (n != null) {
            if (n.getValor() < minvalor) {
                minvalor = n.getValor();

            }
            n = n.getProximo(valor);
       }
       return minvalor;
    }

    @Override
    public int maximo() {
        No atual = new No(valor);
        int maxvalor = cabeca.getValor();
         int maxIndex = 0;
        int atualIndex = 0; 
        while (atual != null) {
            if (atual.valor > maxvalor) {
                maxvalor = atual.valor;
                maxIndex = atualIndex + 1;
            }
            atual = atual.getProximo();
            atualIndex++;
        }
    }

    @Override
    public int predecessor(int valor) {
        if (cabeca == null) {
            return null;
        
        }
        while (atual != null )
    }

    @Override
    public int sucessor(int valor) {
       
    }

    @Override
    public void insereElemento(int valor) {
       
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
    }

    @Override
    public void insereInicio(int valor) {
       if (this.cabeca == null) {
        this.cabeca = new No(valor);
       }

    }

    @Override
    public void insereFim(int valor) {
        No atual = cabeca;
       while (atual.getProximo() != null) {
           atual = atual.getProximo();
       }
    }

    @Override
    public void remove(int valor) {
       
    }

    @Override
    public void removeIndice(int indice) {
        if (cabeca == null) {
            System.out.println("Lista ligada vazia. Não é possível remover.");
            return;
        }

        
        if (indice == 0) {
            cabeca = cabeca.getProximo();
            return;
        }

        No atual = cabeca;
        int contador = 0;

        
        while (contador < indice - 1 && atual != null) {
            atual = atual.getProximo();
            contador++;
        }

        
        if (atual == null || atual.getProximo() == null) {
            System.out.println("Índice inválido. Não é possível remover.");
            return;
        }

        
        atual = atual.getProximo().getProximo();
    }
}
    

    @Override
    public void removeInicio() {
        
    }

    @Override
    public void removeFim() {
        
    }
    

