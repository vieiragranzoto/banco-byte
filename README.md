# Banco byte

Banco-byte é um projeto de aprendizagem utilizando o que é 
ensinado na formação Java e Orientação a Objetos da Alura.

## Table of Contents

- [Projeto](#projeto)
- [Packages](#packages)
- [Model](#model)
  + [Classes & Interfaces](#classes--interfaces)
- [Test](#test)
  + [transfere](#transfere)
  + [calculaJuros](#calculajuros)

  
## Projeto

O projeto utiliza composição e interface ao invés de herança,

Este diretório contém funcionalidades do sistema, e testes de aprendizado:

```src/main```

Este diretório contém testes utilizando JUnit:

```src/test```

Este diretório contém documentação do sistema utilizando Javadoc:

```doc```

Este diretório contém jar's criados do projeto.

```libs```

Os arquivos bin e txt são criados nos testes de aprendizado.

O arquivo csv é utilizado no teste de aprendizado TesteScanner.
  
## Packages
  
Pacotes criados para o projeto seguem a nomenclatura:
URL ao contrario do site fictício e nome do projeto
  
Pacote contendo os modelos do projeto:

```br.com.bytebank.banco.model```

Pacote contendo os services do projeto:

```br.com.bytebank.banco.services```

Pacote contendo os testes de aprendizado do projeto:

```br.com.bytebank.banco.test```

## Model

O pacote model é onde contem toda a estrutura do projeto, sendo
utilizado a interface Conta.java para polimorfismo, e a classe 
ContaUtil.java para reutilização de código.

### Classes & Interfaces

Classe que é utilizada na criação de contas Corrente e Poupança:

```Cliente.java```

Classe para ser usada em testes de aprendizado contendo uma coleção de contas:

```CollectionDeContas.java

Interface deve ser implementada por diferentes tipos de Conta
criados no banco:

```Conta.java```

Classe que implementa interface Conta, reutiliza código da
ContaUtil, e tem alteração no metodo transfere:

```ContaCorrente.java```

Classe que implementa interface Conta, reutiliza código da
ContaUtil, e não possui alterações:

```ContaPoupanca.java```

Classe contendo o código que pode ser reutilizado para diferentes
tipos de Conta no banco:

```ContaUtil.java```

Classe de array simples com funcionalidades para guardar contas:

```Guardador.java```

Enum com funcionalidades para serem utilizadas em JurosService:

```Situacao.java```

Classe de exceção unchecked utilizada para valores incorretos:

```ValorIncorretoException.java```

Classe com serviço para calcular juros de Contas:

```JurosService.java```

## Test

O diretório src/test é onde classes de teste devem ser criados utilizando JUnit..

### transfere

Classe criada para testar metodo transfere da classe ContaCorrente:

```ContaCorrenteTest.java```

### calculaJuros

Classe criada para testar calculaJuros da classe JurosService:

```JurosServiceTest.java```


  
  