package net.robertorodriguez.listviewpersonalizado.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import net.robertorodriguez.listviewpersonalizado.R;
import net.robertorodriguez.listviewpersonalizado.entidades.Producto;

import java.util.List;

public class AdaptadorProductos extends ArrayAdapter<Producto> {

    Context context;                                                                  // El contexto
    int layoutItem;                                                            // El layout del ítem
    List<Producto> coleccionDeProductos;                                // La colección de productos

    /**
     * Constructor
     * @param context el contexto
     * @param layoutItem es el layout que pinta el ítem de la lista
     * @param productos la colección de objetos
     */
    public AdaptadorProductos(@NonNull Context context, int layoutItem, @NonNull List<Producto> productos) {
        super(context, layoutItem, productos);

        this.context = context;
        this.layoutItem = layoutItem;
        this.coleccionDeProductos = productos;

    }

    /**
     * Método que se lanza por cada elemento de la colección
     * @param position posición del elemento en la lista
     * @param convertView
     * @param parent elemento padre del ítem (ListView)
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Se incluye el layoutTemplate en el elemento padre (ListView)
        View view = LayoutInflater.from(context).inflate(layoutItem,parent,false);

        // Obtenemos la información del elemento de la lista
        Producto productoLeido = coleccionDeProductos.get( position );

        // Elementos de la interfaz del ítem
        TextView denominacion = (TextView) view.findViewById(R.id.tv_denominacion);
        TextView marca = (TextView) view.findViewById(R.id.tv_marca);
        ImageView imgMiniatrua = (ImageView) view.findViewById(R.id.iv_imagenProducto);

        // Establecemos la info del producto leído en los elementos del ítem
        denominacion.setText( productoLeido.getDenominacion() );
        marca.setText( Integer.toString( productoLeido.getMarca() ) );

        // Uso de Glide para cargar la imagen de mniatura si no es vacía
        if(!productoLeido.getImagen().isEmpty()) {
            Glide.with(context)
                    .load(productoLeido.getImagen())
                    .into(imgMiniatrua);
        }

        return view;

    }
}
