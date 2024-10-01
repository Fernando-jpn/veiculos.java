public class Veiculo {
    private String modelo;
    private int ano;

    //Construtor
    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    //Métodos Getter e Setter
    public String getModelo(){
        return modelo;
    }
    public void setModel(String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    //Métodos a serem sobreescrito 
    public void acelerar(){
        System.out.println("O veículo está acelerando.");
    }
}

public class veiculos extends Veiculo{
    private int numPortas;

    //Contrutor
    public veiculos(String modelo, int ano, int numPortas){
        super(modelo, ano);//"super" chama o construtor da superclasse.
        this.numPortas = numPortas;
    }
    
    //sobreescrevendo o método acelerar
    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando.");
    }

    //Getter e Setter
    public getNumPortas(){
        return numPortas;
    }
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
}

public class Moto extends Veiculo{
    private boolean temCarroSide;

    //Construtor
    public Moto(String modelo, int ano, boolean temCarroSide){
        super(modelo, ano);
        this.temCarroSide = temCarroSide;
    }

    //Sobreescrevendo o método acelerar
    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando.");
    }

    //Getter e Setter
    public boolean getTemCarroSide(){
        return temCarroSide;
    }
    public void setTemCarroSide( boolean temCarroSide){
        this.temCarroSide = temCarroSide;
    }
}

public class Main{
        //Método estático
        public static void exibirlnfoVeiculo(Veiculo veiculo){
            System.out.println("Modelo:" + veiculo.getModelo());
            System.out.println("Ano:" + veiculo.getAno());
            veiculo.acelerar();
        }

        public static void main(String[] args){
            //Criando objetos das subclasses
            veiculos meuCarro = new veiculos("Honda Civic", 2020, 4);
            Moto minhaMoto = new Moto("Harley Davidson", 2018, false);

            //Chamando o método estático
            exibirlnfoVeiculo(meuCarro);
            System.out.println();
            exibirlnfoVeiculo(minhaMoto);
        }
}