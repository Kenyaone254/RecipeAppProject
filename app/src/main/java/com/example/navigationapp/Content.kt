package com.example.navigationapp
import androidx.annotation.DrawableRes

val doctor = Content(
    id= 0,
    title = "How to make pizza",
    thumbnail = R.drawable.pizza,
    body = "Ingredients include \"cheese\", \"flour\", \"pizza Dough\"!\n Step 1\n" +
            "If you have one, place a pizza stone in the oven and heat oven to 500ºF (if you can’t heat oven this high without broiling, set to 475ºF). Dust a baking sheet with cornmeal.\n" +
            "Step 2\n" +
            "On a lightly floured surface, shape pizza dough into a 14- to 16-in oval or circle and place on prepared sheet (make sure that the dough slides easily around the sheet, if not, add a bit more cornmeal). \n" +
            "Step 3\n" +
            "Spread sauce on dough, leaving a ½-in boarder all the way around and sprinkle with mozzarella and then Parmesan. If using a stone, slide the pizza off the sheet onto the stone. Bake until crust is golden brown, 10 to 12 minutes. Sprinkle with basil just before serving, if desired.\n"
)
val group = Content(
    id= 1,
    title = "How to make curry",
    thumbnail = R.drawable.curry,
    body = "Ingredients include \"Basmati rice\", \"water\", \"salt\", \"beef\", \"curry\"\n.Whisk yoghurt with garlic and ginger paste, chilli and turmeric powder and coriander.\n " +
            "Pour over meat.Set aside for 3-4 hours.\n " +
            "Heat oil, fry onion until colored.Add cardamoms and cloves. Fry for 1 minute.\n " +
            "Add meat with marinade.Cook until liquid has been absorbed.\n " +
            "Fry meat until colored. Add tomatoes.\n" +
            "Continue frying for 10 minutes. Sprinkle in cumin and curry leaves.\n " +
            "Pour in water to cover. Simmer until meat is tender.\n " +
            "Serve with rice."
)
val wearables = Content(
    id= 2,
    title = "How to make rice",
    thumbnail = R.drawable.rice,
    body = "Rinse the rice.\n" +
            "Use the right ratio of water. Add 2 parts water and 1 part rice to a large pot. For slightly firmer rice, use 1 part liquid to 2/3 parts rice.\n" +
            "Bring the water to a boil. Once it's boiling, add a big pinch of salt.\n" +
            "Maintain a simmer. Reduce heat to low, cover the pot with a tight fitting lid, and maintain a gentle simmer.\n" +
            "Cook without peeking or stirring. Cook until the water is absorbed, about 18 minutes. Try not to peek until the end of the cooking time so the steam doesn't escape. Whatever you do, don't mix the rice while it's cooking — this will lead to gummy rice.\n" +
            "Let the rice rest covered. Turn off the heat and let the rice sit, covered, for 10 minutes. During this time, the rice will steam for extra fluffy results.\n" +
            "Fluff the rice with a fork."
)
val workout = Content(
    id= 3,
    title = "How to make cake",
    thumbnail = R.drawable.cake,
    body = "Step 1: Prepare Baking Pans\n" +
            "Step 2: Allow Ingredients to Reach Room Temperature\n" +
            "Step 3: Preheat the Oven\n" +
            "Step 4: Stir Together Dry Ingredients\n" +
            "Step 5: Combine the Butter and Sugar\n" +
            "Step 6: Add Eggs One at a Time\n" +
            "Step 7: Alternate Adding Dry and Wet Ingredients\n" +
            "Step 8: Pour Batter into Pans and Bake"
)

data class Content(
    val id: Long,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body: String,
)

//list of the objects
val allArticles  = listOf(doctor, group, wearables, workout)