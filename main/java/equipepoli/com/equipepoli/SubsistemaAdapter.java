package equipepoli.com.equipepoli;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SubsistemaAdapter extends ArrayAdapter<Subsistema> {

    private /*final*/ Context context;
    private /*final*/ ArrayList<Subsistema> elementos;

    public SubsistemaAdapter(Context context, ArrayList<Subsistema> elementos) {
        super (context, /*R.layout.linha*/ 0 , elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        Subsistema subsistemaPosicao = this.elementos.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.linha, null);

        ImageView imagem = (ImageView) convertView.findViewById(R.id.imagem);
        imagem.setImageResource(subsistemaPosicao.getImagem());

        TextView nomeSubsistema = (TextView) convertView.findViewById(R.id.nome);
        nomeSubsistema.setText (subsistemaPosicao.getNome());

        TextView sobre = (TextView) convertView.findViewById(R.id.sobre);
        sobre.setText (subsistemaPosicao.getSobre());

        return convertView;

        /*LayoutInflater inflater = (LayoutInflater)context
                .getSystemService (Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate (R.layout.linha, parent, false);

        TextView nomeSubsistema = (TextView) rowView.findViewById(R.id.nome);
        TextView sobre = (TextView) rowView.findViewById (R.id.sobre);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.image);

        nomeSubsistema.setText(elementos.get (position).getNome());
        sobre.setText(elementos.get(position).getSobre());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;*/

    }

}
