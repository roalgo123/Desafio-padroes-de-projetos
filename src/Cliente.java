// Interface para os produtos que a fábrica irá criar.
interface Veiculo {
    void mover();
}

// Implementação de um produto concreto (Carro).
class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("Carro está se movendo.");
    }
}

// Implementação de um produto concreto (Bicicleta).
class Bicicleta implements Veiculo {
    @Override
    public void mover() {
        System.out.println("Bicicleta está se movendo.");
    }
}

// Interface da fábrica que contém o método Factory Method.
interface FabricaVeiculos {
    Veiculo criarVeiculo();
}

// Implementação da fábrica para carros.
class FabricaCarro implements FabricaVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}

// Implementação da fábrica para bicicletas.
class FabricaBicicleta implements FabricaVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Bicicleta();
    }
}

// Classe cliente que utiliza a fábrica para criar veículos.
public class Cliente {
    public static void main(String[] args) {
        FabricaVeiculos fabricaCarro = new FabricaCarro();
        Veiculo meuCarro = fabricaCarro.criarVeiculo();
        meuCarro.mover();

        FabricaVeiculos fabricaBicicleta = new FabricaBicicleta();
        Veiculo minhaBicicleta = fabricaBicicleta.criarVeiculo();
        minhaBicicleta.mover();
    }
}
