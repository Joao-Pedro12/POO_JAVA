public class Altura1 {

    private double altura;
    private double peso;

    public Altura1(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public void setaltura(double altura){
        this.altura = altura;
    }
    public void setpeso(double peso){
        this.peso = peso;
    }


    public double getaltura() {
        return altura;
    }
    public double getpeso() {
        return peso;
    }


    public void IMC(){
        double imc = peso/(altura * altura);
        System.out.println("O imc do indivíduo é: "+imc );
    }
}
