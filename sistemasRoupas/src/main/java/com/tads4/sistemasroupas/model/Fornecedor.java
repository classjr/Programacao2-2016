package com.tads4.sistemasroupas.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "FORNECEDOR")
public class Fornecedor {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CNPJ")
    private String cnpj;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "fornecedor_has_email", joinColumns = {
        @JoinColumn(name = "id_fornecedor")}, inverseJoinColumns = {
        @JoinColumn(name = "id_email")})
    private Set<Email> emails;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "fornecedor_has_enderecos", joinColumns = {
        @JoinColumn(name = "id_fornecedor")}, inverseJoinColumns = {
        @JoinColumn(name = "id_endereco")})
    private Set<Endereco> enderecos;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "fornecedor_has_telefones", joinColumns = {
        @JoinColumn(name = "id_fornecedor")}, inverseJoinColumns = {
        @JoinColumn(name = "id_telefone")})
    private Set<Telefone> telefones;

    public Fornecedor(String nome, String cnpj, Set<Telefone> telefones, Set<Endereco> enderecos, Set<Email> emails) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefones = telefones;
        this.enderecos = enderecos;
        this.emails = emails;
    }

    public Fornecedor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 67 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
        hash = 67 * hash + (this.emails != null ? this.emails.hashCode() : 0);
        hash = 67 * hash + (this.enderecos != null ? this.enderecos.hashCode() : 0);
        hash = 67 * hash + (this.telefones != null ? this.telefones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
            return false;
        }
        if (this.emails != other.emails && (this.emails == null || !this.emails.equals(other.emails))) {
            return false;
        }
        if (this.enderecos != other.enderecos && (this.enderecos == null || !this.enderecos.equals(other.enderecos))) {
            return false;
        }
        if (this.telefones != other.telefones && (this.telefones == null || !this.telefones.equals(other.telefones))) {
            return false;
        }
        return true;
    }
}
