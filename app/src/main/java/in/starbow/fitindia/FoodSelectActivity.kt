package `in`.starbow.fitindia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import food_adapter
import kotlinx.android.synthetic.main.food_select.*

class FoodSelectActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_select)
        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<model>()
        var calorieText = findViewById<TextView>(R.id.calorieText)
        val reset = findViewById<Button>(R.id.reset)
        val value = findViewById<TextView>(R.id.valueCal)
        list.add(model("Rice", "Plain Rice : 200 cal", R.drawable.rice))
        list.add(model("Khichdi","1 cup : 175 cal",R.drawable.kichidin))
        list.add(model("Chapati", " 2 Plain chapati : 100 cal", R.drawable.chapathi))
        list.add(model("Salad", "Mix salad : 50 cal", R.drawable.saladn))
        list.add(model("Pulihora","150g : 204 cal",R.drawable.pulihora))
        list.add(model("VegBiryani","170g : 198 cal",R.drawable.vegbiryani))
        list.add(model("ChickenBiryani","200g : 292 cal",R.drawable.chickenbiryani))
        list.add(model("MuttonBiryani","200g : 321 cal",R.drawable.muttonbiryani))
        list.add(model("EggBiryani","170g : 222 cal",R.drawable.eggbiryani))


        list.add(model("Bread", "4-bread Slice :65 cal", R.drawable.breadn))
        list.add(model("Milk","100 ml : 88 cal",R.drawable.milk))

        list.add(model("Vegetable Oil","1 tbsp : 120 cal",R.drawable.vegeoil))
        list.add(model("Dal", "Plain dal : 50 cal", R.drawable.daln))
        list.add(model("sambar","2 cups(500g) : 130 cal",R.drawable.sambar))

        list.add(model("Idli","1 idli : 58 cal",R.drawable.idlynew))
        list.add(model("Dosa","Medium Dosa : 168 cal",R.drawable.dosa))
        list.add(model("Vada","1 medu vada : 73 cal",R.drawable.vada))
        list.add(model("Poori","1 poori : 141 cal",R.drawable.puri))
        list.add(model("Upma","100g : 209 cal",R.drawable.upma))

        list.add(model("Onion","1 medium sized onion : 40 cal",R.drawable.onion))
        list.add(model("Tomato","Average sized Tomato : 22 cal",R.drawable.tomatonew))
        list.add(model("Potato","Medium sized potato : 110 cal",R.drawable.potato))
        list.add(model("Lady's Finger or Okra","100g : 33 cal",R.drawable.ladyfinger))
        list.add(model("Capsicum","100g : 40 cal",R.drawable.capsicum))
        list.add(model("Green Leafy Vegetables","100g : 23 cal",R.drawable.green))
        list.add(model("Cabbage","100g : 25 cal",R.drawable.cabbage))
        list.add(model("Cauliflower","100g : 25 cal",R.drawable.cauliflower))
        list.add(model("Brinjal","one cup of cubed raw brinjal : 24 cal",R.drawable.brinjal))
        list.add(model("Drumsticks or Moringa","100g : 25 cal",R.drawable.drumstick))

        list.add(model("Eggs","Small egg 48g : 54 cal",R.drawable.eggsnew))
        list.add(model("Chicken", " chicken : 220 cal", R.drawable.chickenn))
        list.add(model("meat", "250 g red meat : 300 cal", R.drawable.meatn))

        list.add(model("Tomato curry","240g : 173 cal",R.drawable.tomatocurry))
        list.add(model("Potato curry","235g : 204 ccal",R.drawable.potatocurry))
        list.add(model("Lady's finger curry/Okra curry","253g : 137 cal",R.drawable.okracurry))
        list.add(model("Capsicum curry","200g : 265 cal",R.drawable.capsicumcurry))
        list.add(model("Cabbage curry","156g : 81 cal",R.drawable.cabbagecurry))
        list.add(model("Cauliflower curry","140g : 110 cal",R.drawable.cauliflowercurry))
        list.add(model("Brinjal curry","100g : 142 cal",R.drawable.brinjalcurry))
        list.add(model("Egg curry","230g : 211 cal",R.drawable.eggcurry))
        list.add(model("Chicken curry","230g : 243 cal",R.drawable.chickencurry))

        list.add(model("Carrot", " carrot: 30 cal", R.drawable.carrotn))
        list.add(model("Cucumber","Medium sized cucumber : 30 cal",R.drawable.cucumber))
        list.add(model("Beetroot","50g : 22 cal",R.drawable.beetroot))
        list.add(model("Broccoli","100g : 34 cal",R.drawable.broco))
        list.add(model("Apple", "Apple : 114 cal", R.drawable.applen))
        list.add(model("Orange", " Orange : 52 cal", R.drawable.orangen))
        list.add(model("Grapes","100g : 67 cal",R.drawable.grapesn))
        list.add(model("Guava","100g : 68 cal",R.drawable.guavan))
        list.add(model("Watermelon","100g : 30 cal",R.drawable.watermelon))
        list.add(model("Chikoo","100g : 83 cal",R.drawable.sapotan))
        list.add(model("Pineapple","100g : 50 cal",R.drawable.pinen))
        list.add(model("Papaya","100g : 32 cal",R.drawable.papayan))
        list.add(model("Muskmelon","100g : 34 cal",R.drawable.muskmelon))
        list.add(model("Mango","100g : 60 cal",R.drawable.mangon))
        list.add(model("Lychee","100g : 66 cal",R.drawable.lychee))
        list.add(model("Custard Apple","100g : 94 cal",R.drawable.custardapple))
        list.add(model("Cherries","100g : 50 cal",R.drawable.cherries))
        list.add(model("Berries","100g : 57 cal",R.drawable.berries))
        list.add(model("Banana","100g : 89 cal",R.drawable.banana))
        list.add(model("Avacado","100g : 160 cal",R.drawable.avacado))
        list.add(model("Strawberry", "Strawberry : 110 cal", R.drawable.strawberryn))

        list.add(model("Noodles", "Noodles : 140 cal", R.drawable.noodelsn))
        list.add(model("Burger", "Burger: 200 cal", R.drawable.burgern))
        list.add(model("Pizza", " Pizza : 250 cal", R.drawable.pizzan))
        list.add(model("cold drink", "Carbonated cold drink :140 cal", R.drawable.coldrnkn))
        list.add(model("Cake", "1- Cake Slice : 132 cal", R.drawable.cakeslice))
        list.add(model("Muffin", "muffin : 47 cal", R.drawable.cupcaken))
        list.add(model("Chocolate", "Chocolate bar : 200 cal", R.drawable.chocobar))
        list.add(model("Donut", "donut : 110 cal", R.drawable.donutnew))
        list.add(model("Laddu", "Laddu : 170  cal", R.drawable.laddus))
        list.add(model("French fries", "French Fries medium : 110 cal", R.drawable.frenchfries))
        list.add(model("Hot dog", "Hot Dog: 95  cal", R.drawable.hotdogn))
        list.add(model("Rolls", " Roll : 68 cal", R.drawable.frankie))
        list.add(model("Potato Chips", "Potato chips : 155 cal", R.drawable.potatochipsn))
        list.add(model("Sundae", "Sundae : 110 cal", R.drawable.sundaen))
        list.add(model("Ice Cream", " Ice Cream : 100 cal", R.drawable.icecreamn))
        list.add(model("PaniPuri","1 plate of panipuri : 329 cal",R.drawable.panipuru))
        list.add(model("Vadapav","Single slice of vadapav : 304 cal",R.drawable.vadapav))



        listview.adapter = food_adapter(this, R.layout.row, list)
        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                value.setText((value.text.toString().toInt() + 200).toString())
            }
            if (position == 1) {
                value.setText((value.text.toString().toInt() + 175).toString())
            }
            if (position == 2) {
                value.setText((value.text.toString().toInt() + 100).toString())
            }
            if (position == 3) {
                value.setText((value.text.toString().toInt() + 50).toString())
            }
            if (position == 4) {
                value.setText((value.text.toString().toInt() + 204).toString())
            }
            if (position == 5) {
                value.setText((value.text.toString().toInt() + 198).toString())
            }
            if (position == 6) {
                value.setText((value.text.toString().toInt() + 292).toString())
            }
            if (position == 7) {
                value.setText((value.text.toString().toInt() + 321).toString())
            }
            if (position == 8) {
                value.setText((value.text.toString().toInt() + 222).toString())
            }
            if (position == 9) {
                value.setText((value.text.toString().toInt() + 65).toString())
            }
            if (position == 10) {
                value.setText((value.text.toString().toInt() + 88).toString())
            }

            if (position == 11) {
                value.setText((value.text.toString().toInt() + 120).toString())
            }
            if (position == 12) {
                value.setText((value.text.toString().toInt() + 50).toString())
            }
            if (position == 13) {
                value.setText((value.text.toString().toInt() + 130).toString())
            }
            if (position == 14) {
                value.setText((value.text.toString().toInt() + 58).toString())
            }
            if (position == 15) {
                value.setText((value.text.toString().toInt() + 168).toString())
            }
            if (position == 16) {
                value.setText((value.text.toString().toInt() + 73).toString())
            }
            if (position == 17) {
                value.setText((value.text.toString().toInt() + 141).toString())
            }
            if (position == 18) {
                value.setText((value.text.toString().toInt() + 209).toString())
            }
            if (position == 19) {
                value.setText((value.text.toString().toInt() + 40).toString())
            }
            if (position == 20) {
                value.setText((value.text.toString().toInt() + 22).toString())
            }
            if (position == 21) {
                value.setText((value.text.toString().toInt() + 110).toString())
            }
            if (position == 22) {
                value.setText((value.text.toString().toInt() + 33).toString())
            }
            if (position == 23) {
                value.setText((value.text.toString().toInt() + 40).toString())
            }
            if (position == 24) {
                value.setText((value.text.toString().toInt() + 23).toString())
            }
            if (position == 25) {
                value.setText((value.text.toString().toInt() + 25).toString())
            }
            if (position == 26) {
                value.setText((value.text.toString().toInt() + 25).toString())
            }
            if (position == 27) {
                value.setText((value.text.toString().toInt() + 24).toString())
            }
            if (position == 28) {
                value.setText((value.text.toString().toInt() + 25).toString())
            }
            if (position == 29) {
                value.setText((value.text.toString().toInt() + 54).toString())
            }
            if(position == 30)
            {
                value.setText((value.text.toString().toInt()+ 220).toString())
            }
            if (position == 31) {
                value.setText((value.text.toString().toInt() + 300).toString())
            }
            if (position == 32) {
                value.setText((value.text.toString().toInt() + 173).toString())
            }
            if (position == 33) {
                value.setText((value.text.toString().toInt() + 204).toString())
            }
            if (position == 34) {
                value.setText((value.text.toString().toInt() + 137).toString())
            }
            if (position == 35) {
                value.setText((value.text.toString().toInt() + 265).toString())
            }
            if (position == 36) {
                value.setText((value.text.toString().toInt() + 81).toString())
            }
            if (position == 37) {
                value.setText((value.text.toString().toInt() + 110).toString())
            }
            if (position == 38) {
                value.setText((value.text.toString().toInt() + 142).toString())
            }
            if (position == 39) {
                value.setText((value.text.toString().toInt() + 211).toString())
            }
            if (position == 40) {
                value.setText((value.text.toString().toInt() + 243).toString())
            }
            if (position == 41) {
                value.setText((value.text.toString().toInt() + 30).toString())
            }
            if (position == 42) {
                value.setText((value.text.toString().toInt() + 30).toString())
            }
            if (position == 43) {
                value.setText((value.text.toString().toInt() + 22).toString())
            }
            if (position == 44) {
                value.setText((value.text.toString().toInt() + 34).toString())
            }
            if (position == 45) {
                value.setText((value.text.toString().toInt() + 114).toString())
            }
            if (position == 46) {
                value.setText((value.text.toString().toInt() + 52).toString())
            }
            if (position == 47) {
                value.setText((value.text.toString().toInt() + 67).toString())
            }
            if (position == 48) {
                value.setText((value.text.toString().toInt() + 68).toString())
            }
            if (position == 49) {
                value.setText((value.text.toString().toInt() + 30).toString())
            }
            if (position == 50) {
                value.setText((value.text.toString().toInt() + 83).toString())
            }
            if (position == 51) {
                value.setText((value.text.toString().toInt() + 50).toString())
            }
            if (position == 52) {
                value.setText((value.text.toString().toInt() + 32).toString())
            }
            if (position == 53) {
                value.setText((value.text.toString().toInt() + 34).toString())
            }
            if (position == 54) {
                value.setText((value.text.toString().toInt() + 60).toString())
            }
            if (position == 55) {
                value.setText((value.text.toString().toInt() + 66).toString())
            }
            if (position == 56) {
                value.setText((value.text.toString().toInt() + 94).toString())
            }
            if (position == 57) {
                value.setText((value.text.toString().toInt() + 50).toString())
            }
            if (position == 58) {
                value.setText((value.text.toString().toInt() + 57).toString())
            }
            if (position == 59) {
                value.setText((value.text.toString().toInt() + 89).toString())
            }
            if (position == 60) {
                value.setText((value.text.toString().toInt() + 160).toString())
            }
            if (position == 61) {
                value.setText((value.text.toString().toInt() + 110).toString())
            }
            if (position == 62) {
                value.setText((value.text.toString().toInt() + 140).toString())
            }
            if (position ==63) {
                value.setText((value.text.toString().toInt() + 200).toString())
            }
            if (position == 64) {
                value.setText((value.text.toString().toInt() + 250).toString())
            }
            if (position == 65) {
                value.setText((value.text.toString().toInt() + 140).toString())
            }
            if (position == 66) {
                value.setText((value.text.toString().toInt() + 132).toString())
            }
            if (position == 67) {
                value.setText((value.text.toString().toInt() + 47).toString())
            }
            if (position == 68) {
                value.setText((value.text.toString().toInt() + 200).toString())
            }
            if (position == 69) {
                value.setText((value.text.toString().toInt() + 110).toString())
            }
            if (position == 70) {
                value.setText((value.text.toString().toInt() + 170).toString())
            }
            if (position == 71) {
                value.setText((value.text.toString().toInt() + 110).toString())
            }
            if (position == 72) {
                value.setText((value.text.toString().toInt() + 95).toString())
            }
            if (position == 73) {
                value.setText((value.text.toString().toInt() + 68).toString())
            }
            if (position == 74) {
                value.setText((value.text.toString().toInt() + 155).toString())
            }
            if (position == 75) {
                value.setText((value.text.toString().toInt() + 110).toString())
            }
            if (position == 76) {
                value.setText((value.text.toString().toInt() + 100).toString())
            }
            if (position == 77) {
                value.setText((value.text.toString().toInt() + 329).toString())
            }
            if (position == 78) {
                value.setText((value.text.toString().toInt() + 304).toString())
            }



        }
        reset.setOnClickListener {
            value.setText("0")
        }
    }
}
