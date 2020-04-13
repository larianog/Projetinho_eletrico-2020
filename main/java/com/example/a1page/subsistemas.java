package com.example.a1page;

public class subsistemas {

    private String nome;
    private String chefe;
    private int ciclo;
    private int imgResId;

    private subsistemas(String nome, String chefe, int ciclo, int imgResId) {
        this.nome = nome;
        this.chefe = chefe;
        this.ciclo = ciclo;
        this.imgResId = imgResId;
    }

    public static final subsistemas[] subsistemas = {
            new subsistemas("Anest","Gustavo", 2020, R.drawable.gustavo),
            new subsistemas("CVT", "Lucas", 2020, R.drawable.lucas),
            new subsistemas("Design", "Rafa", 2020,R.drawable.rafael),
            new subsistemas("Direcao","Guilherme", 2020,R.drawable.guilherme),
            new subsistemas("Eletrico","Ricardo", 2020,R.drawable.ricardo),
            new subsistemas("Estrutura","Robson", 2020,R.drawable.robson),
            new subsistemas("Freios","Julia", 2020,R.drawable.julia),
            new subsistemas("Motor","Barbeta", 2020,R.drawable.barbeta),
            new subsistemas("Transmissao e RT", "Geovani", 2020,R.drawable.geovani),
            new subsistemas("Suspensao", "Victor", 2020,R.drawable.victor)
    };
    public String toString()
        {
        return this.nome;
        }
    public String getNome()
        {
        return nome;
        }
    public String getChefe()
        {
        return chefe;
        }
    public int getCiclo()
        {
        return ciclo;
        }
    public int getImgResId()
        {
        return imgResId;
        }

        }

