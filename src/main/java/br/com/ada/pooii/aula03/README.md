## Exercício: Lista Genérica

Você deve criar uma classe genérica chamada `MinhaLista` que representa uma lista simples de elementos genéricos.
A classe MinhaLista deve permitir adicionar elementos, obter a posição de um elemento pelo ID, recuperar elementos por índice e também verificar se um elemento está presente na lista.

A classe `MinhaLista` deve ter os seguintes métodos:

adicionar(T elemento): Adiciona um elemento à lista.
obter(int indice): T: Retorna o elemento na posição especificada pelo índice.
indice(U identificador): int: Retorna a posicao do elemento pelo seu ID.
contem(T elemento): boolean: Verifica se a lista contém o elemento especificado.


### Exemplo de uso

```java
MinhaLista<Pessoa, Long> listaDeNomes = new MinhaLista<>();

var jorge = new Pessoa(1, "jorge");
listaDeNomes.adicionar(jorge);

var maria = new Pessoa(2, "maria");
listaDeNomes.adicionar(maria);

var jess = new Pessoa(3, "jess");
listaDeNomes.adicionar(jess);

System.out.println("Elemento na posição 2: " + listaDeNomes.obter(2)); // Saída: Pessoa[id=3, nome="jess]
System.out.println("A lista contém a pessoa maria? " + listaDeNomes.contem(maria)); // Saída: true
System.out.println("Qual a posicao do elemento de ID 3? " + listaDeNomes.indice(3)); // Saída: 2

```

## Objeto Pessoa

```java
public record Pessoa(long id, String nome) {}
```
### Java Records
**Record** é um tipo especial de classe em Java projetada especificamente para **armazenar dados imutáveis**. O principal caso de uso dos registros é atuar como simples **portadores de dados**, sem a necessidade de encapsulamento ou comportamento adicional.
Os registros são uma **forma concisa de criar classes** que são principalmente suportes de dados. Eles reduzem significativamente o código padrão, **_gerando automaticamente acessadores de campo,construtores, métodos equals() , hashCode() e toString()_**.