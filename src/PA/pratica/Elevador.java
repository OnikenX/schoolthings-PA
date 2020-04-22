package PA.pratica;

public class Elevador {

    // Andares

    static class andar{
        @Override
        public String toString() {
            return "andar";
        }
    }

    // resto chao
    static class RC extends andar{
        @Override
        public String toString() {
            return "RC";
        }
    }

    //1 andar
    static class andar1 extends andar{
        @Override
        public String toString() {
            return "andar1";
        }
    }

    //2 andar
    static class andar2 extends andar{
        @Override
        public String toString() {
            return "andar2";
        }
    }

// -------------------------------------------- //
// -------------------------------------------- //
// -------------------------------------------- //
// -------------------------------------------- //














    // GERAIS

    andar estado;

    public Elevador(){
        //o elevador começa no rc
        estado =new RC();
    }

    public boolean subir(){
        if(estado instanceof RC)
            estado = new andar1();
        else if(estado instanceof andar1)
            estado = new andar2();
        else
            return false;
        return true;
    }
    public boolean descer(){
        if(estado instanceof andar2)
            estado = new andar1();
        else if (estado instanceof andar1)
            estado = new RC();
        else
            return false;
        return true;
    }


















    // OVERRIDES

    @Override
    public String toString() {
        return "Elevador{" +
                "estado=" + estado.toString()
                +   '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elevador elevador = (Elevador) o;

        return estado != null ? estado.equals(elevador.estado) : elevador.estado == null;
    }

    @Override
    public int hashCode() {
        return estado != null ? estado.hashCode() : 0;
    }

}














