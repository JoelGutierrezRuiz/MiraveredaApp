/*public class RecyclerAdapterPeliculas extends RecyclerView.Adapter<RecyclerAdapterPeliculas.ViewHolder>{
    private int layout;

    private Context context;
    private Contenido contenido;

    public RecyclerAdapterPeliculas(Context context,int layout, Contenido contenido) {
        super();
        this.layout = layout;
        this.context = context;
        this.contenido = contenido;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.segunda_pantalla,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Date date = new Date((long)root.list.get(position).dt*1000);
        holder.tvDia.setText((new SimpleDateFormat("EEEE")).format(date));
        base.ImageDownloader.downloadImage(Parameters.ICON_URL_PRE + root.list.get(0).weather.get(0).icon + Parameters.ICON_URL_POST,holder.ivRecycler);
    }

    @Override
    public int getItemCount() {
        return contenidos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvFecha;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFecha = itemView.findViewById(R.id.tvFecha);

        }
    }
}*/