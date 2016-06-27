package com.example.administrador.projeto_23;

import br.clube.view.ImageAdapter;

import android.app.ActionBar;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import  android.widget.ActionMenuView;



public class MainActivity extends AppCompatActivity {

    public static final int MENU1 = Menu.FIRST; // mensagem
    public static final int MENU2 = Menu.FIRST + 1; // sair
    public static final int MENU3 = Menu.FIRST + 3;// opções
    public static final int MENU4 = Menu.FIRST + 4;// opções


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()  {
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                //Toast.makeText (getApplicationContext(),"É so um teste", Toast.LENGTH_SHORT).show ();
                //Toast.makeText (getApplicationContext(), msg, Toast.LENGTH_SHORT).show ();
            }
        });
    }
    // Menu
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

//        menu.add(0, MENU1, 0, "");
//        menu.add(0, MENU2, 0, "");
//        menu.add(0, MENU3, 0, "");
//        menu.getItem(0).setIcon(android.R.drawable.ic_menu_more);
//        menu.getItem(1).setIcon(android.R.drawable.ic_input_add);
//        menu.getItem(2).setIcon(android.R.drawable.ic_dialog_map);
        // Sub Menu
//        SubMenu sub = options.addSubMenu("Opções");
//        sub.add(0, MENU3, 0, "Tela2");
//        sub.add(0, MENU4, 0, "Site DevMobileBrasil");
        //return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }
    //public boolean OnPrepareOptionsMenu(Menu menu){
       // MenuInflater inflater = getMenuInflater();
       // inflater.inflate(R.menu.menu_main, menu);
       // return true;
    //}
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case MENU1:
                Toast.makeText(MainActivity.this, "Menu1 Selecionado", Toast.LENGTH_SHORT).show();
                return true;

            case MENU2:
                Toast.makeText(MainActivity.this, "Menu2 Selecionado",Toast.LENGTH_SHORT).show();
                return true;

            case MENU3:
                Toast.makeText(MainActivity.this, "Menu3 Selecionado",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
        //return false;
    }
    //public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo  menuInfo){}
    //   super.onCreateContextMenu(menu, view , menuInfo);
    //   menu.add(0,MENU1,0,"opcao 1");
    //   menu.add(0,MENU2,0,"Opcao 2");
    //}


    // método que abre o browser e visita o nosso site
    void siteDevMobile() {
        String end = "http://devmobilebrasil.com.br/sitevelho";
        Uri uri = Uri.parse(end);
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

    }
}
