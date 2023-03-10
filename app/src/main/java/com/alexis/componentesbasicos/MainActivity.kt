package com.alexis.componentesbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cadIb:String="ImageButton Off";
        var dato:Boolean=false

        // ImgButton
        val btnImagen:ImageButton=findViewById(R.id.botonImagen)
        btnImagen.setOnClickListener{
            dato = !dato

            if (dato){
                cadIb = "ImageButton Pressed"
            } else {
                cadIb = "ImageButton Off"
            }
        }

        val botonPresionar:Button=findViewById(R.id.btnImprimir)
        botonPresionar.setOnClickListener{ onClick(cadIb)}
    }

    private fun onClick(cadIb: String) {
        val campoNombre: EditText = findViewById(R.id.txtNombre)
        val campoEdad: EditText = findViewById(R.id.txtEdad)
        val radio1: RadioButton = findViewById(R.id.radio1)
        val radio2: RadioButton = findViewById(R.id.radio2)
        val check1: CheckBox = findViewById(R.id.checkbox1)
        val check2: CheckBox = findViewById(R.id.checkbox2)
        val tgBtn: ToggleButton = findViewById(R.id.tgbtn)
        val switchBtn: Switch = findViewById(R.id.Switch)


        var nombre=campoNombre.text.toString()
        var edad=campoEdad.text.toString()

        var cad:String="${cadIb}\n";

        // Switch
        if (switchBtn.isChecked()==true){
            cad += "Was Activated\n"
        } else {
            cad += "It was Deactivated\n"
        }
        // ToggleButton
        if (tgBtn.isChecked()==true){
            cad += "TogglButton Activo\n"
        } else {
            cad += "TogglButton Desactivo\n"
        }
        // RadioButton
        if (radio1.isChecked()==true){
            cad += "Radio 1 Seleccionado\n";
        } else if (radio2.isChecked()){
            cad += "Radio 2 Seleccionado\n";
        }
        // CheckBox
        if (check1.isChecked()==true){
            cad += "Check 1 Seleccionado\n"
        }
        if (check2.isChecked()){
            cad += "Check 2 Seleccionado\n"
        }

        Toast.makeText(this, "${cad}${nombre}\n${edad}\n", Toast.LENGTH_LONG).show()
    }


}