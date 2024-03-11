/*
Esta classe implementa um array "resistente a falhas
que impede a ocorrência de erros de tempo de execução"
 */

class FailSoftArray {
    private int a[]; // referência ao array
    private int errval; // valor a ser retornado se get() falhar
    public int length; //lenght é pública

    /*
    Constrói o array dados seu tamnho e valor
    a ser retornado se get() falhar.
     */

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    //Retorna o valor do índice especificado.
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    //Insere um valor em umm índice. Retorna false em um caso de falha.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    //Retorna true se index estiver dentro dos limites.
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }


}
