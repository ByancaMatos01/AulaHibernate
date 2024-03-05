# Início Rápido: Hibernate - Configuração Básica
* Este repositório contém um exemplo simples para começar a usar o Hibernate em seu projeto Java.
* Este guia rápido aborda a configuração básica do Hibernate, incluindo a adição das dependências necessárias ao arquivo pom.xml do Maven, a criação de uma entidade simples e a persistência e gravação de dados no banco de dados MySQL.
  
# Criação do POM.XML
* dicione as seguintes dependências ao seu arquivo pom.xml para garantir que o Hibernate e o conector MySQL sejam incluídos em seu projeto:
  
# Criando a Entidade Filme

* Agora, vamos criar uma entidade simples chamada Filme que representará os dados que queremos persistir no banco de dados:

<code>   
	
	@Entity
        public class Filme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	    private String nomeDiretor;
	
	  private int id;
	  private String nome;
	  private String nomeDiretor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeDiretor() {
		return nomeDiretor;
	}
	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}
        }

</code>

# Persistência e Gravação no Banco de Dados

* Com a entidade Filme definida, podemos agora criar uma instância dela, definir os valores desejados e persisti-la no banco de dados usando o Hibernate. Abaixo está um exemplo simples de como fazer isso:

   <code>
	   
		Filme f1= new Filme();
		f1.setNome("x-man");
		f1.setNomeDiretor("Lucas George");
		
		
		EntityManagerFactory mf= Persistence.createEntityManagerFactory("HibJPA");
		EntityManager em= mf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f1);
		em.getTransaction().commit();

</code>

# Imagem da gravação No BD
![image](https://github.com/ByancaMatos01/AulaHibernate/assets/122841376/bded6400-00c4-47c4-8124-93c2f8383828)
