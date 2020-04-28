package equipepoli.com.equipepoli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ArrayList<Subsistema> subsistema = new ArrayList<Subsistema>();

        Subsistema a = new Subsistema("SUSPENSÃO", "Chefe: Victor Melo\nFunção: Garantir que a roda esteja em contato com o" +
                " solo em todo percurso e filtrar as forças que entram nas rodas e chegam até o piloto, garantindo " +
                " dirigibilidade e conforto.",R.drawable.susp );
        Subsistema b = new Subsistema("FREIOS", "Chefe: Julia Furlan\nFunção: Fazer com que o carro freie com eficiência," +
                " garantindo a segurança dos envolvidos.",R.drawable.freios );
        Subsistema c = new Subsistema("ANÁLISE ESTRUTURAL","Chefe: Gustavo\nFunção: Responsável pela análise do" +
                " comportamento das peças quando sofrem os esforços da competição.", R.drawable.anest);
        Subsistema d = new Subsistema("DESIGN","Chefe: Rafael Miyamoto\nFunção: Responsável pela concepção do carro," +
                " pensando em sua estética e ergonomia, de forma a dar uma originalidade a ele e conforto ao piloto.", R.drawable.design);
        Subsistema e = new Subsistema("DIREÇÃO","Chefe:Guilherme Silva\nFunção: Fazer o carro ter a direção desejada" +
                " através do volante, projetando e analisando esterçamento das rodas, etc.", R.drawable.dir);
        Subsistema f = new Subsistema("ELÉTRICO","Chefe: Ricardo Seiki\nFunção: Responsável pela concepção das" +
                " kill-switches, para segurança do piloto, sensoriamento e aquisição de dados para análise de" +
                " dados voltada para melhora na perfomance do carro", R.drawable.eletrico);
        Subsistema g = new Subsistema("ESTRUTURA","Chefe: Elysnaldo Robson \nFunção: Projetar e realizar uma estrutura para" +
                " sustentar todos os subsistemas em uma gaiola com um espaço mínimo ao redor do piloto.", R.drawable.estrutura);
        Subsistema h = new Subsistema("MOTOR","Chefe:Henrique Silva\nFunção: Responsável pela manutenção e regulagem" +
                " do motor, impedindo que este trabalhe perfeitamente durante as competições, garatindo a" +
                " segurança do piloto e dos envolvidos.", R.drawable.motor);
        Subsistema i = new Subsistema("TRANSMISSAO","Chefe: Geovani Rodrigues\nFunção: Responsável pela redução" +
                " das rotações e aumento do torque do motor através de sistemas de transmissão, para que a energia" +
                " chegue às rodas de acordo com as demandas da competição.", R.drawable.transmissap);
        Subsistema j = new Subsistema("CVT","Chefe: Lucas Domingues.\nFunção: Responsável pela implementação do câmbio no carro" +
                " que possibilita a troca de marchas eficiente durante as competições.", R.drawable.cvt);

        subsistema.add(a);
        subsistema.add(b);
        subsistema.add(c);
        subsistema.add(d);
        subsistema.add(e);
        subsistema.add(f);
        subsistema.add(g);
        subsistema.add(h);
        subsistema.add(i);
        subsistema.add(j);

        SubsistemaAdapter adapterSubsistema = new SubsistemaAdapter(this,subsistema);

        ListView lvSubsistema = (ListView) findViewById(R.id.lvSubsistema);

        lvSubsistema.setAdapter(adapterSubsistema);


        /*ListView lvSubsistema = (ListView) findViewById(R.id.lvSubsistema);
        ArrayAdapter adapter = new SubsistemaAdapter(this, adicionarSubsistema());
        lista.setAdapter(adapter);

    }

         public ArrayList <Subsistema> adicionarSubsistema() {
        ArrayList<Subsistema> subsistema = new ArrayList<Subsistema>();
        Subsistema e = new Subsistema("SUSPENSÃO","@string/susp",R.drawable.susp);

        subsistema.add(e);

        subsistema.add(e);
        e = new Subsistema("FREIOS","@string/freios", R.drawable.freios);

        subsistema.add(e);
        e = new Subsistema("ANÁLISE ESTRUTURAL","@string/anest", R.drawable.anest);

        subsistema.add(e);
        e = new Subsistema("DESIGN","@string/design", R.drawable.design);

        subsistema.add(e);
        e = new Subsistema("DIREÇÃO","@string/dir", R.drawable.dir);

        subsistema.add(e);
        e = new Subsistema("ELÉTRICO","@string/eletrico", R.drawable.eletrico);

        subsistema.add(e);
        e = new Subsistema("ESTRUTURA","@string/estrutura", R.drawable.estrutura);

        subsistema.add(e);
        e = new Subsistema("MOTOR","@string/motor", R.drawable.motor);

        subsistema.add(e);
        e = new Subsistema("TRANSMISSAO","@string/transmissao", R.drawable.transmissap);

        subsistema.add(e);
        e = new Subsistema("CVT","@string/cvt", R.drawable.cvt);

        subsistema.add(e);

        return subsistema;*/
    }

}
