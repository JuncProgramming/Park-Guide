package com.junclabs.parkguide.data

import com.junclabs.parkguide.R

object DataSource {
    private val coffeePlaces = listOf(
        Place(
            title = R.string.owoce_i_warzywa,
            description = R.string.owoce_i_warzywaD,
            image = R.drawable.owoceiwarzywa,
        ), Place(
            title = R.string.starbucks,
            description = R.string.starbucksD,
            image = R.drawable.starbucks,
        ), Place(
            title = R.string.etno,
            description = R.string.etnoD,
            image = R.drawable.etno,
        ), Place(
            title = R.string.herbaciarnia_kocie_oczy,
            description = R.string.herbaciarnia_kocie_oczyD,
            image = R.drawable.kocieoczy,
        ), Place(
            title = R.string.costa,
            description = R.string.costaD,
            image = R.drawable.costa,
        )
    )
    private val restaurantPlaces = listOf(
        Place(
            title = R.string.meat_point,
            description = R.string.meat_pointD,
            image = R.drawable.meatpoint,
        ), Place(
            title = R.string.cud_miod,
            description = R.string.cud_miodD,
            image = R.drawable.cudmi_d,
        ), Place(
            title = R.string.manekin,
            description = R.string.manekinD,
            image = R.drawable.manekin,
        ), Place(
            title = R.string.powidok,
            description = R.string.powidokD,
            image = R.drawable.powidok,
        ), Place(
            title = R.string.galicja,
            description = R.string.galicjaD,
            image = R.drawable.galicja,
        )
    )
    private val parksPlaces = listOf(
        Place(
            title = R.string.yosemite_national_park,
            description = R.string.yosemite_national_parkD,
            image = R.drawable.yosemite,
        ),
        Place(
            title = R.string.grand_canyon_national_park,
            description = R.string.grand_canyon_national_parkD,
            image = R.drawable.grandcanyon,
        ),
        Place(
            title = R.string.sequoia_national_park,
            description = R.string.sequoia_national_parkD,
            image = R.drawable.sequoia,
        ),
        Place(
            title = R.string.rocky_mountain_national_park,
            description = R.string.rocky_mountain_national_parkD,
            image = R.drawable.rockymountains,
        ),
        Place(
            title = R.string.zion_national_park,
            description = R.string.zion_national_parkD,
            image = R.drawable.zion,
        ),
    )

    private val centersPlaces = listOf(
        Place(
            title = R.string.manufaktura,
            description = R.string.manufakturaD,
            image = R.drawable.manufaktura,
        ),
        Place(
            title = R.string.sukcesja,
            description = R.string.sukcesjaD,
            image = R.drawable.sukcesja,
        ),
        Place(
            title = R.string.galeria_lodzka,
            description = R.string.galeria_lodzkaD,
            image = R.drawable.galeria_dzka,
        ),
        Place(
            title = R.string.galeria_retkinska,
            description = R.string.galeria_retkinskaD,
            image = R.drawable.galeriaretkiska,
        ),
    )
    val categories = listOf(
        Category(R.string.coffee_shops, coffeePlaces),
        Category(R.string.restaurants, restaurantPlaces),
        Category(R.string.parks, parksPlaces),
        Category(R.string.shopping_centers, centersPlaces)
    )
}