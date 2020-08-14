package br.edu.unifei.ecot12.lucifer.insert;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unifei.ecot12.lucifer.Anjo;
import br.edu.unifei.ecot12.lucifer.Arma;
import br.edu.unifei.ecot12.lucifer.Caso;
import br.edu.unifei.ecot12.lucifer.Demonio;
import br.edu.unifei.ecot12.lucifer.Detetive;
import br.edu.unifei.ecot12.lucifer.Humano;
import br.edu.unifei.ecot12.lucifer.Inferno;
import br.edu.unifei.ecot12.lucifer.Paraiso;
import br.edu.unifei.ecot12.lucifer.PecadoEnum;
import br.edu.unifei.ecot12.lucifer.Prova;
import br.edu.unifei.ecot12.lucifer.Reu;
import br.edu.unifei.ecot12.lucifer.Vitima;



public class AppInsert {

    public static void main(String args[]) {
    	Properties properties = new Properties();
		properties.setProperty("javax.persistence.schema-generation.database.action", "create");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("luciferPU", properties);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        
        //HUMANOS
        String nomeHumanoVitima[] = {"Rafael", "Duda", "Ana", "Bruno"};
        String sexoHumanoVitima[] = {"Masculino", "Feminino", "Feminino", "Masculino"};
        PecadoEnum pecadoHumanoVitima[] = {PecadoEnum.PREGUICA, PecadoEnum.GULA, PecadoEnum.IRA, PecadoEnum.VAIDADE};
        Integer pecadorHumanoVitima[] = {10, 11, 12, 5};
        String profissaoHumanoVitima[] = {"Estudante", "Empresaria", "Engenheira", "Desempregado"};
        
        String nomeHumanoDetetive[] = {"Chloe Decker", "Marcus Pierce", "Ella Lopez", "Dan"};
        String sexoHumanoDetetive[] = {"Feminino", "Masculino", "Feminino", "Masculino"};
        PecadoEnum pecadoHumanoDetetive[] = {PecadoEnum.VAIDADE, PecadoEnum.GULA, PecadoEnum.AVAREZA, PecadoEnum.INVEJA};
        Integer pecadorHumanoDetetive[] = {8, 7, 3, 16, 14, 20, 22, 1};
        String profissaoHumanoDetetive[] = {"Detetive LAPD", "Chefe LAPD", "Perícia LAPD", "Detetive LAPD"};
        
        String nomeHumanoReu[] = {"Gabriel", "Enzo", "Tathy", "Leo"};
        String sexoHumanoReu[] = {"Masculino", "Masculino", "Feminino", "Masculino"};
        PecadoEnum pecadoHumanoReu[] = {PecadoEnum.LUXURIA, PecadoEnum.VAIDADE, PecadoEnum.IRA, PecadoEnum.AVAREZA};
        Integer pecadorHumanoReu[] = {14, 20, 22, 1};
        String profissaoHumanoReu[] = {"Traficante", "Professor", "Professora", "Ladrão"};
        
       //TIPO DOS CASOS
        String casoTipo[] = {"Roubo", "Homicídio", "Roubo", "Homicídio"};
        
        //ARMAS
        String armaModelo[] = {"Simples", "Velho", "Novo", "Complexo"};
        String armaTipo[] = {"Pistola", "Faca", "Caco de vidro", "Taco"};
        
        
        for(int i = 0; i < 4; i++) {
        	Humano hVitima = new Humano();
        	Humano hReu = new Humano();
        	Humano hDetetive = new Humano();
        	Vitima vitima = new Vitima();
        	Reu reu = new Reu();
        	Detetive detetive = new Detetive();
        	Arma arma = new Arma();
            List <Prova> provas = new ArrayList<>();
        	Caso caso = new Caso();
        	Paraiso p = new Paraiso();
        	Inferno inf = new Inferno();
            
            
        	
        	hVitima.setNome(nomeHumanoVitima[i]);
        	hVitima.setSexo(sexoHumanoVitima[i]);
        	hVitima.setPecador(pecadorHumanoVitima[i]);
        	hVitima.getPecados().add(pecadoHumanoVitima[i]);
        	hVitima.getPecados().add(PecadoEnum.AVAREZA);
        	hVitima.setProfissao(profissaoHumanoVitima[i]);
        	em.persist(hVitima);
        	
        	hReu.setNome(nomeHumanoReu[i]);
        	hReu.setSexo(sexoHumanoReu[i]);
        	hReu.setPecador(pecadorHumanoReu[i]);
        	hReu.getPecados().add(pecadoHumanoReu[i]);
        	hReu.getPecados().add(PecadoEnum.AVAREZA);
        	hReu.setProfissao(profissaoHumanoReu[i]);
        	em.persist(hReu);
        	
        	hDetetive.setNome(nomeHumanoDetetive[i]);
        	hDetetive.setSexo(sexoHumanoDetetive[i]);
        	hDetetive.setPecador(pecadorHumanoDetetive[i]);
        	hDetetive.getPecados().add(pecadoHumanoDetetive[i]);
        	hDetetive.getPecados().add(PecadoEnum.AVAREZA);
        	hDetetive.setProfissao(profissaoHumanoDetetive[i]);
        	em.persist(hDetetive);
        	
        	arma.setModelo(armaModelo[i]);
        	arma.setTipo(armaTipo[i]);
        	em.persist(arma);
        	
        	p.getSalvos().add(hVitima);
        	inf.getCondenados().add(hReu);
        	
        	em.persist(p);
        	em.persist(inf);
        	
        	detetive.setHumanoDetetive(hDetetive);
        	vitima.setHumanoVitima(hVitima);
        	reu.setHumanoReu(hReu);
        	em.persist(detetive);
        	em.persist(vitima);
        	em.persist(reu);
        	em.merge(hDetetive);
        	em.merge(hVitima);
        	em.merge(hReu);
        	
        	
        	provas.add(detetive);
        	provas.add(vitima);
        	provas.add(reu);
        	provas.add(arma);
        	
        	caso.setProvas(provas);
        	caso.setTipo(casoTipo[i]);
        	
        	em.persist(caso);
        }
        
        
       /* //ARMA CASO 1
        Arma a1 = new Arma();
        a1.setModelo("simples");
        a1.setTipo("Pistola");

        //DETETIVE CASO 1
        Humano h1 = new Humano();
        h1.setNome("Chloe Decker");
        h1.setSexo("FEMININO");
        h1.getPecados().add(PecadoEnum.VAIDADE);
        h1.setProfissao("Detetive LAPD");
        h1.setPecador(10);
        
        Detetive d1 = new Detetive();
        d1.setHumanoDetetive(h1);
        
        //VITIMA CASO 1
        Humano h2 = new Humano();
        h2.setNome("Rafael");
        h2.setPecador(10);
        h2.getPecados().add(PecadoEnum.PREGUICA);
        h2.setSexo("Masculino");
        h2.setProfissao("Estudante");
        
        Vitima v1 = new Vitima();
        v1.setHumanoVitima(h2);
        
        //REU CASO 1
        Humano h3 = new Humano();
        h3.setNome("Gabriel");
        h3.setSexo("Masculino");
        h3.getPecados().add(PecadoEnum.LUXURIA);
        h3.setProfissao("Estudante");
        h3.setPecador(10);

        Reu r1 = new Reu();
        r1.setHumanoReu(h3);
        
        
        List <Prova> provas = new ArrayList<>();
        provas.add(d1);
        provas.add(a1);
        provas.add(v1);
        provas.add(r1);
        
        Caso caso1 = new Caso();
        caso1.setTipo("Roubo");
        caso1.setProvas(provas);
        
        em.persist(caso1);
        em.merge(caso1); */
        
  // --------------------------------------------------------------------------------
        
        //DEMONIO 1
        Demonio dem1 = new Demonio();
        dem1.setNome("Mazikeen");
        dem1.setSexo("FEMININO");
        dem1.getPecados().add(PecadoEnum.INVEJA);
        dem1.getPecados().add(PecadoEnum.LUXURIA);
        dem1.getPecados().add(PecadoEnum.IRA);
        dem1.setFuncao("Cacadora de recompensas");
        
        em.persist(dem1);
        
        Anjo a1 = new Anjo();
        a1.setNome("Amenadiel");
        a1.setSexo("MASCULINO");
        a1.setCorAsa("Preta");
        a1.getPecados().add(PecadoEnum.IRA);
        a1.setPoder("Cronocinese");
        
        em.persist(a1);
        


        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
