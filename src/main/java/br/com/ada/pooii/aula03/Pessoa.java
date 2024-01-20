package br.com.ada.pooii.aula03;

/*Record gera automaticamente acessadores de campo,construtores, métodos equals() , hashCode() e toString().*/
public record Pessoa (long id, String nome) implements ObjetoComID<Long>{
    @Override
    public Long getId() {
        return id;
    }
}

