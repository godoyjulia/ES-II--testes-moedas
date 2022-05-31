public class Parquimetro implements ParquimetroInterface {
    private int saldo;
    public Parquimetro() {
        saldo = 0; 
    }

    public void insereMoeda(int valor) {
        switch (valor) {
        case 1:
        case 5:
        case 10:
        case 25:
        case 50:
        case 100:
        saldo += valor;
        break;
        default:
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return this.saldo;
    }

    @Override
    public boolean emiteTicket() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int devolve() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}