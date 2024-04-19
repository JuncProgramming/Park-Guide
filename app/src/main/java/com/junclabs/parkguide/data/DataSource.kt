package com.junclabs.parkguide.data

import com.junclabs.parkguide.R

object DataSource {
    private val alaskaParks = listOf(
        Park(
            title = R.string.Denali_National_Park_and_Preserve,
            description = R.string.Denali_National_Park_and_Preserve_Description,
            image = R.drawable.denalinationalparkandpreserve
        ),
        Park(
            title = R.string.Gates_of_the_Arctic_National_Park_and_Preserve,
            description = R.string.Gates_of_the_Arctic_National_Park_and_Preserve_Description,
            image = R.drawable.gatesofthearcticnationalparkandpreserve
        ),
        Park(
            title = R.string.Glacier_Bay_National_Park_and_Reserve,
            description = R.string.Glacier_Bay_National_Park_and_Reserve_Description,
            image = R.drawable.glacierbaynationalparkandpreserve
        ),
        Park(
            title = R.string.Katmai_National_Park,
            description = R.string.Katmai_National_Park_Description,
            image = R.drawable.katmainationalparkandpreserve
        ),
        Park(
            title = R.string.Kenai_Fjords_National_Park,
            description = R.string.Kenai_Fjords_National_Park_Description,
            image = R.drawable.kenaifjordsnationalpark
        ),
        Park(
            title = R.string.Kobuk_Valley_National_Park,
            description = R.string.Kobuk_Valley_National_Park_Description,
            image = R.drawable.kobukvalleynationalpark
        ),
        Park(
            title = R.string.Lake_Clark_National_Park_and_Preserve,
            description = R.string.Lake_Clark_National_Park_and_Preserve_Description,
            image = R.drawable.lakeclarknationalparkandreserve
        ),
        Park(
            title = R.string.WrangellSt__Elias_National_Park_and_Preserve,
            description = R.string.WrangellSt__Elias_National_Park_and_Preserve_Description,
            image = R.drawable.wrangellst_eliasnationalparkandpreserve
        ),
    )
    private val americanSamoaParks = listOf(
        Park(
            title = R.string.National_Park_of_American_Samoa,
            description = R.string.National_Park_of_American_Samoa_Description,
            image = R.drawable.nationalparkofamericansamoa
        )
    )
    private val arizonaParks = listOf(
        Park(
            title = R.string.Grand_Canyon_National_Park,
            description = R.string.Grand_Canyon_National_Park_Description,
            image = R.drawable.grandcanyonnationalpark
        ), Park(
            title = R.string.Petrified_Forest_National_Park,
            description = R.string.Petrified_Forest_National_Park_Description,
            image = R.drawable.petrifiedforestnationalpark
        ), Park(
            title = R.string.Saguaro_National_Park,
            description = R.string.Saguaro_National_Park_Description,
            image = R.drawable.saguaronationalpark
        )
    )
    private val arkansasParks = listOf(
        Park(
            title = R.string.Hot_Springs_National_Park,
            description = R.string.Hot_Springs_National_Park_Description,
            image = R.drawable.hotspringsnationalpark
        )
    )
    private val californiaParks = listOf(
        Park(
            title = R.string.Channel_Islands_National_Park,
            description = R.string.Channel_Islands_National_Park_Description,
            image = R.drawable.channelislandsnationalpark
        ),
        Park(
            title = R.string.Death_Valley_National_Park,
            description = R.string.Death_Valley_National_Park_Description,
            image = R.drawable.deathvalleynationalpark
        ),
        Park(
            title = R.string.Joshua_Tree_National_Park_and_Preserve,
            description = R.string.Joshua_Tree_National_Park_and_Preserve_Description,
            image = R.drawable.joshuatreenationalpark
        ),
        Park(
            title = R.string.Kings_Canyon_National_Park,
            description = R.string.Kings_Canyon_National_Park_Description,
            image = R.drawable.kingscanyonnationalpark
        ),
        Park(
            title = R.string.Lassen_Volcanic_National_Park,
            description = R.string.Lassen_Volcanic_National_Park_Description,
            image = R.drawable.lassenvolcanicnationalpark
        ),
        Park(
            title = R.string.Pinnacles_National_Park,
            description = R.string.Pinnacles_National_Park_Description,
            image = R.drawable.pinnaclesnationalpark
        ),
        Park(
            title = R.string.Redwood_National_and_State_Parks,
            description = R.string.Redwood_National_and_State_Parks_Description,
            image = R.drawable.redwoodnationalandstateparks
        ),
        Park(
            title = R.string.Sequoia_National_Park,
            description = R.string.Sequoia_National_Park_Description,
            image = R.drawable.sequoianationalpark
        ),
        Park(
            title = R.string.Yosemite_National_Park,
            description = R.string.Yosemite_National_Park_Description,
            image = R.drawable.yosemitenationalpark
        ),
    )
    private val coloradoParks = listOf(
        Park(
            title = R.string.Black_Canyon_of_the_Gunnison_National_Park,
            description = R.string.Black_Canyon_of_the_Gunnison_National_Park_Description,
            image = R.drawable.blackcanyonofthegunnisonnationalpark
        ),
        Park(
            title = R.string.Great_Sand_Dunes_National_Park_and_Reserve,
            description = R.string.Great_Sand_Dunes_National_Park_and_Reserve_Description,
            image = R.drawable.greatsanddunesnationalparkandpreserve
        ),
        Park(
            title = R.string.Mesa_Verde_National_Park,
            description = R.string.Mesa_Verde_National_Park_Description,
            image = R.drawable.mesaverdenationalpark
        ),
        Park(
            title = R.string.Rocky_Mountain_National_Park,
            description = R.string.Rocky_Mountain_National_Park_Description,
            image = R.drawable.rockymountainnationalpark
        ),
    )
    private val floridaParks = listOf(
        Park(
            title = R.string.Biscayne_National_Park,
            description = R.string.Biscayne_National_Park_Description,
            image = R.drawable.biscaynenationalpark
        ),
        Park(
            title = R.string.Dry_Tortugas_National_Park,
            description = R.string.Dry_Tortugas_National_Park_Description,
            image = R.drawable.drytortugasnationalpark
        ),
        Park(
            title = R.string.Everglades_National_Park,
            description = R.string.Everglades_National_Park_Description,
            image = R.drawable.evergladesnationalpark
        ),
    )
    private val hawaiiParks = listOf(
        Park(
            title = R.string.Haleakalā_National_Park,
            description = R.string.Haleakalā_National_Park_Description,
            image = R.drawable.haleakalnationalpark
        ), Park(
            title = R.string.Hawaii_Volcanoes_National_Park,
            description = R.string.Hawaii_Volcanoes_National_Park_Description,
            image = R.drawable.hawaiivolcanoesnationalpark
        )
    )
    private val idahoParks = listOf(
        Park(
            title = R.string.Yellowstone_National_Park,
            description = R.string.Yellowstone_National_Park_Description,
            image = R.drawable.yellowstonenationalpark
        )
    )
    private val indianaParks = listOf(
        Park(
            title = R.string.Indiana_Dunes_National_Park,
            description = R.string.Indiana_Dunes_National_Park_Description,
            image = R.drawable.indianadunesnationalpark
        )
    )
    private val maineParks = listOf(
        Park(
            title = R.string.Acadia_National_Park,
            description = R.string.Acadia_National_Park_Description,
            image = R.drawable.acadianationalpark
        )
    )
    private val michiganParks = listOf(
        Park(
            title = R.string.Isle_Royale_National_Park,
            description = R.string.Isle_Royale_National_Park_Description,
            image = R.drawable.isleroyalenationalpark
        )
    )
    private val minnesotaParks = listOf(
        Park(
            title = R.string.Voyageurs_National_Park,
            description = R.string.Voyageurs_National_Park_Description,
            image = R.drawable.voyageursnationalpark
        )
    )
    private val missouriParks = listOf(
        Park(
            title = R.string.Gateway_Arch_National_Park,
            description = R.string.Gateway_Arch_National_Park_Description,
            image = R.drawable.gatewayarchnationalpark
        )
    )
    private val montanaParks = listOf(
        Park(
            title = R.string.Glacier_National_Park,
            description = R.string.Glacier_National_Park,
            image = R.drawable.glaciernationalpark
        ), Park(
            title = R.string.Yellowstone_National_Park,
            description = R.string.Yellowstone_National_Park_Description,
            image = R.drawable.yellowstonenationalpark
        )
    )
    private val nevadaParks = listOf(
        Park(
            title = R.string.Death_Valley_National_Park,
            description = R.string.Death_Valley_National_Park_Description,
            image = R.drawable.deathvalleynationalpark
        ),
        Park(
            title = R.string.Great_Basin_National_Park,
            description = R.string.Great_Basin_National_Park_Description,
            image = R.drawable.greatbasinnationalpark
        ),
    )
    private val newMexicoParks = listOf(
        Park(
            title = R.string.Carlsbad_Caverns_National_Park,
            description = R.string.Carlsbad_Caverns_National_Park_Description,
            image = R.drawable.carlsbadcavernsnationalpark
        ),
        Park(
            title = R.string.White_Sands_National_Park,
            description = R.string.Wind_Cave_National_Park_Description,
            image = R.drawable.whitesandsnationalpark
        ),
    )
    private val northCarolinaParks = listOf(
        Park(
            title = R.string.Great_Smoky_Mountains_National_Park,
            description = R.string.Great_Smoky_Mountains_National_Park_Description,
            image = R.drawable.greatsmokymountainsnationalpark
        ),
    )
    private val northDakotaParks = listOf(
        Park(
            title = R.string.Theodore_Roosevelt_National_Park,
            description = R.string.Theodore_Roosevelt_National_Park_Description,
            image = R.drawable.theodorerooseveltnationalpark
        ),
    )
    private val ohioParks = listOf(
        Park(
            title = R.string.Cuyahoga_Valley_National_Park,
            description = R.string.Cuyahoga_Valley_National_Park_Description,
            image = R.drawable.cuyagohavalleynationalpark
        ),
    )
    private val oregonParks = listOf(
        Park(
            title = R.string.Crater_Lake_National_Park,
            description = R.string.Crater_Lake_National_Park_Description,
            image = R.drawable.craterlakenationalpark
        ),
    )
    private val southCarolinaParks = listOf(
        Park(
            title = R.string.Congaree_National_Park,
            description = R.string.Congaree_National_Park_Description,
            image = R.drawable.congareenationalpark
        ),
    )
    private val southDakotaParks = listOf(
        Park(
            title = R.string.Badlands_National_Park,
            description = R.string.Badlands_National_Park_Description,
            image = R.drawable.badlandsnationalpark
        ),
        Park(
            title = R.string.Wind_Cave_National_Park,
            description = R.string.Wind_Cave_National_Park_Description,
            image = R.drawable.windcavenationalpark
        ),
    )
    private val tennesseeParks = listOf(
        Park(
            title = R.string.Great_Smoky_Mountains_National_Park,
            description = R.string.Great_Smoky_Mountains_National_Park_Description,
            image = R.drawable.greatsmokymountainsnationalpark
        )
    )
    private val texasParks = listOf(
        Park(
            title = R.string.Big_Bend_National_Park,
            description = R.string.Big_Bend_National_Park_Description,
            image = R.drawable.bigbendnationalpark
        ),
        Park(
            title = R.string.Guadalupe_Mountains_National_Park,
            description = R.string.Guadalupe_Mountains_National_Park_Description,
            image = R.drawable.guadalupemountainsnationalpark
        ),
    )
    private val utahParks = listOf(
        Park(
            title = R.string.Arches_National_Park,
            description = R.string.Arches_National_Park_Description,
            image = R.drawable.archesnationalpark
        ),
        Park(
            title = R.string.Bryce_Canyon_National_Park,
            description = R.string.Bryce_Canyon_National_Park_Description,
            image = R.drawable.brycecanyonnationalpark
        ),
        Park(
            title = R.string.Canyonlands_National_Park,
            description = R.string.Canyonlands_National_Park_Description,
            image = R.drawable.canyonlandsnationalpark
        ),
        Park(
            title = R.string.Capitol_Reef_National_Park,
            description = R.string.Capitol_Reef_National_Park_Description,
            image = R.drawable.capitolreefnationalpark
        ),
        Park(
            title = R.string.Zion_National_Park,
            description = R.string.Zion_National_Park_Description,
            image = R.drawable.zionnationalpark
        ),
    )
    private val VirginIslandsPark = listOf(
        Park(
            title = R.string.Virgin_Islands_National_Park,
            description = R.string.Virgin_Islands_National_Park_Description,
            image = R.drawable.virginislandsnationalpark
        ),
    )
    private val virginiaParks = listOf(
        Park(
            title = R.string.Shenandoah_National_Park,
            description = R.string.Shenandoah_National_Park_Description,
            image = R.drawable.shenandoahnationalpark
        ),
    )
    private val washingtonParks = listOf(
        Park(
            title = R.string.Mount_Rainier_National_Park,
            description = R.string.Mount_Rainier_National_Park_Description,
            image = R.drawable.mountrainiernationalpark
        ),
        Park(
            title = R.string.North_Cascades_National_Park,
            description = R.string.North_Cascades_National_Park_Description,
            image = R.drawable.northcascadesnationalpark
        ),
        Park(
            title = R.string.Olympic_National_Park,
            description = R.string.Olympic_National_Park_Description,
            image = R.drawable.olympicnationalpark
        ),
    )
    private val westVirginiaParks = listOf(
        Park(
            title = R.string.New_River_Gorge_National_Park_and_Preserve,
            description = R.string.New_River_Gorge_National_Park_and_Preserve_Description,
            image = R.drawable.newrivegorgenationalparkandpreserve
        ),
    )
    private val wyomingParks = listOf(
        Park(
            title = R.string.Grand_Teton_National_Park,
            description = R.string.Grand_Teton_National_Park_Description,
            image = R.drawable.grandtetonnationalpark
        ), Park(
            title = R.string.Yellowstone_National_Park,
            description = R.string.Yellowstone_National_Park_Description,
            image = R.drawable.yellowstonenationalpark
        )
    )

    val states = listOf(
        State(R.string.Alaska, alaskaParks),
        State(R.string.American_Samoa, americanSamoaParks),
        State(R.string.Arizona, arizonaParks),
        State(R.string.Arkansas, arkansasParks),
        State(R.string.California, californiaParks),
        State(R.string.Colorado, coloradoParks),
        State(R.string.Florida, floridaParks),
        State(R.string.Hawaii, hawaiiParks),
        State(R.string.Idaho, idahoParks),
        State(R.string.Indiana, indianaParks),
        State(R.string.Maine, maineParks),
        State(R.string.Michigan, michiganParks),
        State(R.string.Minnesota, minnesotaParks),
        State(R.string.Missouri, missouriParks),
        State(R.string.Montana, montanaParks),
        State(R.string.Nevada, nevadaParks),
        State(R.string.New_Mexico, newMexicoParks),
        State(R.string.North_Carolina, northCarolinaParks),
        State(R.string.North_Dakota, northDakotaParks),
        State(R.string.Ohio, ohioParks),
        State(R.string.Oregon, oregonParks),
        State(R.string.South_Carolina, southCarolinaParks),
        State(R.string.South_Dakota, southDakotaParks),
        State(R.string.Tennessee, tennesseeParks),
        State(R.string.Texas, texasParks),
        State(R.string.Utah, utahParks),
        State(R.string.Virgin_Islands, VirginIslandsPark),
        State(R.string.Virginia, virginiaParks),
        State(R.string.Washington, washingtonParks),
        State(R.string.West_Virginia, westVirginiaParks),
        State(R.string.Wyoming, wyomingParks)
    )
}