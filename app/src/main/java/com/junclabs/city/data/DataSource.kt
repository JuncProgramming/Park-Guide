package com.junclabs.city.data

import com.junclabs.city.R

object DataSource {
    val defaultCategory = getCategories()[0]
    fun getCategories(): List<Category> {
        return listOf(
            Category(R.string.coffee_shops),
            Category(R.string.restaurants),
            Category(R.string.parks),
            Category(R.string.shopping_centers)
        )
    }
    val places = listOf(
        Place(
            title = R.string.owoce_i_warzywa,
            description = R.string.owoce_i_warzywa,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.starbucks,
            description = R.string.starbucks,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.etno,
            description = R.string.etno,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.herbaciarnia_kocie_oczy,
            description = R.string.herbaciarnia_kocie_oczy,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.costa,
            description = R.string.costa,
            image = R.drawable.ic_launcher_background,
        ),


        Place(
            title = R.string.meat_point,
            description = R.string.meat_point,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.cud_miód,
            description = R.string.cud_miód,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.manekin,
            description = R.string.manekin,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.powidok,
            description = R.string.powidok,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.galicja,
            description = R.string.galicja,
            image = R.drawable.ic_launcher_background,
        ),


        Place(
            title = R.string.yosemite_national_park,
            description = R.string.yosemite_national_park,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.grand_canyon_national_park,
            description = R.string.grand_canyon_national_park,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.sequoia_national_park,
            description = R.string.sequoia_national_park,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.rocky_mountain_national_park,
            description = R.string.rocky_mountain_national_park,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.zion_national_park,
            description = R.string.zion_national_park,
            image = R.drawable.ic_launcher_background,
        ),


        Place(
            title = R.string.manufaktura,
            description = R.string.manufaktura,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.sukcesja,
            description = R.string.sukcesja,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.galeria_łódzka,
            description = R.string.galeria_łódzka,
            image = R.drawable.ic_launcher_background,
        ),
        Place(
            title = R.string.galeria_retkińska,
            description = R.string.galeria_retkińska,
            image = R.drawable.ic_launcher_background,
        ),
    )
    val defaultPlace = places[0]
}