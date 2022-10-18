# Banco byte

Banco-byte é um projeto de aprendizagem utilizando o que é 
ensinado na formação Java e Orientação a Objetos da Alura.

## Table of Contents

- [Projeto](#projeto)
  + [Packages](#packages)
- [Model](#model)
  + [Classes & Interfaces](#classes--interfaces)
- [Test](#test)
  + [Criar Conta](#criar-conta)

  
## Projeto

O projeto utiliza composição e interface ao invés de herança,
  
### Packages
  
Pacotes criados para o projeto seguem a nomenclatura:
URL ao contrario do site fictício e nome do projeto
  
Pacote contendo os modelos do projeto:
```br.com.bytebank.banco.model```

Pacote contendo os testes do projeto:
```br.com.bytebank.banco.test```

## Model

O pacote model é onde contem toda a estrutura do projeto, sendo
utilizado a interface Conta.java para polimorfismo, e a classe 
ContaUtil.java para reutilização de código.

### Classes & Interfaces

Classe que é utilizada na criação de contas Corrente e Poupança
```Cliente.java```

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

Classe de exceção unchecked utilizada para valores incorretos:
```ValorIncorretoException.java```

## Test

O pacote teste é onde classes de teste devem ser criados.

### Criar Conta

Classe criada para testar metodo transfere da classe ContaCorrente:
```TesteTransfereCC.java```


  
  