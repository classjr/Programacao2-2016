package com.tads4.sistemasroupas;

import ExemplosAula.hibernate.HibernateUtils;
import ExemplosAula.hibernate.Institute;
import ExemplosAula.hibernate.Loan;
import ExemplosAula.hibernate.Products;
import ExemplosAula.hibernate.Provider;
import ExemplosAula.hibernate.Teacher;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Main mySystem = new Main();
        mySystem.setVisible(true); */ 
        
        //onetomay();
        //manytomany();
        onetoone();
        System.out.println("Salvando no Banco !!!");
        
    }
    
    public static void onetomay(){
        
        HibernateUtils database = new HibernateUtils();
        Loan     loan    = new Loan();
        Teacher  teacher = new Teacher();
        Collection<Products> products = new HashSet<Products>();
        Collection<Loan> loans = new HashSet<Loan>();
        
        // Criando um objeto emprestimo ****************************************
        loan.setDate(new Date("20/08/2016"));
        loan.setStatus(false);
        
        //Criando lista de produtos ********************************************
        Products pr1 = new Products();
        Products pr2 = new Products();
        
        pr1.setName("Projetor");
        pr1.setColor("black");
        pr1.setModel("small");
        pr1.setPrice(500.50);
        pr1.setBarcode("000.000.01");
        pr1.setLoan(loan);
        pr1.setProvider(null);
        
        pr2.setName("spreedPlan");
        pr2.setColor("black");
        pr2.setModel("bigest");
        pr2.setPrice(54.50);
        pr2.setBarcode("300.000.21");
        pr2.setLoan(loan);
        pr2.setProvider(null);
        
        products.add(pr2);
        products.add(pr1);
        loan.setProducts(products);
        
        //Criando um usuario para o emprestimo *********************************
        teacher.setDepartament("Ciencia da Computacao");
        loan.setTeacher(teacher);
        loans.add(loan);
        
        teacher.setLoans(loans);
        
        //Salvado no Banco (Na verdade, estamos transformando estes objetos transientes em persistentes)
        database.save(teacher);
        database.close();
        
    }
    
    public static void manytomany(){
        
        HibernateUtils database = new HibernateUtils();
        Products product = new Products();
        Collection<Provider> providers = new HashSet<Provider>();
        
        //Preenchendo produto **************************************************
        product.setBarcode("400.000.12");
        product.setColor("Green");
        product.setLoan(null);
        product.setModel("bluePrint");
        product.setPrice(100.00);
        product.setName("TableDigital");
        
        
        //Preenchendo fornecedores *********************************************
        Provider pro1 = new Provider();
        Provider pro2 = new Provider();
        
        pro1.setCnpj("000.0001.0002.000-1");
        pro1.setName("ComercialAndroid");
        pro1.setPhone("+5005634567869");
        
        pro2.setCnpj("222.0001.0442.000-4");
        pro2.setName("FullOptimazed");
        pro2.setPhone("+50056345673547");
        
        
        providers.add(pro1);
        providers.add(pro2);
        
        product.setProvider(providers);
        //Salvando no Banco de Dados *******************************************
        database.save(pro1);
        database.save(pro2);
        
        database.save(product);
        database.close();
        
    }
    
    public static void onetoone(){
        
        HibernateUtils database = new HibernateUtils();
        Institute institute = new Institute();
        Teacher teacher     = new Teacher();
        
        //Salvar teacher
        teacher.setDepartament("Ciencias Exatas e da Terra");
        teacher.setLoans(null);
        
        //Salvar institute
        institute.setName("Ciencia da Computacao");
        institute.setTeacher(teacher);
        teacher.setInstitute(institute);
        
        database.save(teacher);
        database.close();
        

        
    }
}
