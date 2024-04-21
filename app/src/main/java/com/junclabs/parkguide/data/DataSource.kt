package com.junclabs.parkguide.data

import com.junclabs.parkguide.R

object DataSource {
    private val denali = Park(
        title = R.string.Denali_National_Park_and_Preserve,
        description = R.string.Denali_National_Park_and_Preserve_Description,
        image = R.drawable.denalinationalparkandpreserve
    )
    private val gatesOfTheArctic = Park(
        title = R.string.Gates_of_the_Arctic_National_Park_and_Preserve,
        description = R.string.Gates_of_the_Arctic_National_Park_and_Preserve_Description,
        image = R.drawable.gatesofthearcticnationalparkandpreserve
    )
    private val glacierBay = Park(
        title = R.string.Glacier_Bay_National_Park_and_Reserve,
        description = R.string.Glacier_Bay_National_Park_and_Reserve_Description,
        image = R.drawable.glacierbaynationalparkandpreserve
    )
    private val katmai = Park(
        title = R.string.Katmai_National_Park,
        description = R.string.Katmai_National_Park_Description,
        image = R.drawable.katmainationalparkandpreserve
    )
    private val kenaiFjords = Park(
        title = R.string.Kenai_Fjords_National_Park,
        description = R.string.Kenai_Fjords_National_Park_Description,
        image = R.drawable.kenaifjordsnationalpark
    )
    private val kobukValley = Park(
        title = R.string.Kobuk_Valley_National_Park,
        description = R.string.Kobuk_Valley_National_Park_Description,
        image = R.drawable.kobukvalleynationalpark
    )
    private val lakeClark = Park(
        title = R.string.Lake_Clark_National_Park_and_Preserve,
        description = R.string.Lake_Clark_National_Park_and_Preserve_Description,
        image = R.drawable.lakeclarknationalparkandreserve
    )
    private val wrangellStElias = Park(
        title = R.string.WrangellSt__Elias_National_Park_and_Preserve,
        description = R.string.WrangellSt__Elias_National_Park_and_Preserve_Description,
        image = R.drawable.wrangellst_eliasnationalparkandpreserve
    )
    private val americanSamoa = Park(
        title = R.string.National_Park_of_American_Samoa,
        description = R.string.National_Park_of_American_Samoa_Description,
        image = R.drawable.nationalparkofamericansamoa
    )
    private val grandCanyon = Park(
        title = R.string.Grand_Canyon_National_Park,
        description = R.string.Grand_Canyon_National_Park_Description,
        image = R.drawable.grandcanyonnationalpark
    )
    private val petrifiedForest = Park(
        title = R.string.Petrified_Forest_National_Park,
        description = R.string.Petrified_Forest_National_Park_Description,
        image = R.drawable.petrifiedforestnationalpark
    )
    private val saguaro = Park(
        title = R.string.Saguaro_National_Park,
        description = R.string.Saguaro_National_Park_Description,
        image = R.drawable.saguaronationalpark
    )
    private val hotSprings = Park(
        title = R.string.Hot_Springs_National_Park,
        description = R.string.Hot_Springs_National_Park_Description,
        image = R.drawable.hotspringsnationalpark
    )
    private val channelIslands = Park(
        title = R.string.Channel_Islands_National_Park,
        description = R.string.Channel_Islands_National_Park_Description,
        image = R.drawable.channelislandsnationalpark
    )
    private val deathValley = Park(
        title = R.string.Death_Valley_National_Park,
        description = R.string.Death_Valley_National_Park_Description,
        image = R.drawable.deathvalleynationalpark
    )
    private val joshuaTree = Park(
        title = R.string.Joshua_Tree_National_Park_and_Preserve,
        description = R.string.Joshua_Tree_National_Park_and_Preserve_Description,
        image = R.drawable.joshuatreenationalpark
    )
    private val kingsCanyon = Park(
        title = R.string.Kings_Canyon_National_Park,
        description = R.string.Kings_Canyon_National_Park_Description,
        image = R.drawable.kingscanyonnationalpark
    )
    private val lassenVolcanic = Park(
        title = R.string.Lassen_Volcanic_National_Park,
        description = R.string.Lassen_Volcanic_National_Park_Description,
        image = R.drawable.lassenvolcanicnationalpark
    )
    private val pinnacles = Park(
        title = R.string.Pinnacles_National_Park,
        description = R.string.Pinnacles_National_Park_Description,
        image = R.drawable.pinnaclesnationalpark
    )
    private val redwood = Park(
        title = R.string.Redwood_National_and_State_Parks,
        description = R.string.Redwood_National_and_State_Parks_Description,
        image = R.drawable.redwoodnationalandstateparks
    )
    private val sequoia = Park(
        title = R.string.Sequoia_National_Park,
        description = R.string.Sequoia_National_Park_Description,
        image = R.drawable.sequoianationalpark
    )
    private val yosemite = Park(
        title = R.string.Yosemite_National_Park,
        description = R.string.Yosemite_National_Park_Description,
        image = R.drawable.yosemitenationalpark
    )
    private val blackCaynonOfTheGunnison = Park(
        title = R.string.Black_Canyon_of_the_Gunnison_National_Park,
        description = R.string.Black_Canyon_of_the_Gunnison_National_Park_Description,
        image = R.drawable.blackcanyonofthegunnisonnationalpark
    )
    private val greatSandDunes = Park(
        title = R.string.Great_Sand_Dunes_National_Park_and_Reserve,
        description = R.string.Great_Sand_Dunes_National_Park_and_Reserve_Description,
        image = R.drawable.greatsanddunesnationalparkandpreserve
    )
    private val mesaVerde = Park(
        title = R.string.Mesa_Verde_National_Park,
        description = R.string.Mesa_Verde_National_Park_Description,
        image = R.drawable.mesaverdenationalpark
    )
    private val rockyMountain = Park(
        title = R.string.Rocky_Mountain_National_Park,
        description = R.string.Rocky_Mountain_National_Park_Description,
        image = R.drawable.rockymountainnationalpark
    )
    private val biscayne = Park(
        title = R.string.Biscayne_National_Park,
        description = R.string.Biscayne_National_Park_Description,
        image = R.drawable.biscaynenationalpark
    )
    private val dryTortugas = Park(
        title = R.string.Dry_Tortugas_National_Park,
        description = R.string.Dry_Tortugas_National_Park_Description,
        image = R.drawable.drytortugasnationalpark
    )
    private val everglades = Park(
        title = R.string.Everglades_National_Park,
        description = R.string.Everglades_National_Park_Description,
        image = R.drawable.evergladesnationalpark
    )
    private val haleakala = Park(
        title = R.string.Haleakalā_National_Park,
        description = R.string.Haleakalā_National_Park_Description,
        image = R.drawable.haleakalnationalpark
    )
    private val hawaiiVolcanoes = Park(
        title = R.string.Hawaii_Volcanoes_National_Park,
        description = R.string.Hawaii_Volcanoes_National_Park_Description,
        image = R.drawable.hawaiivolcanoesnationalpark
    )
    private val yellowstone = Park(
        title = R.string.Yellowstone_National_Park,
        description = R.string.Yellowstone_National_Park_Description,
        image = R.drawable.yellowstonenationalpark
    )
    private val indianaDunes = Park(
        title = R.string.Indiana_Dunes_National_Park,
        description = R.string.Indiana_Dunes_National_Park_Description,
        image = R.drawable.indianadunesnationalpark
    )
    private val acadia = Park(
        title = R.string.Acadia_National_Park,
        description = R.string.Acadia_National_Park_Description,
        image = R.drawable.acadianationalpark
    )
    private val isleRoyale = Park(
        title = R.string.Isle_Royale_National_Park,
        description = R.string.Isle_Royale_National_Park_Description,
        image = R.drawable.isleroyalenationalpark
    )
    private val voyageurs = Park(
        title = R.string.Voyageurs_National_Park,
        description = R.string.Voyageurs_National_Park_Description,
        image = R.drawable.voyageursnationalpark
    )
    private val gatewayArch = Park(
        title = R.string.Gateway_Arch_National_Park,
        description = R.string.Gateway_Arch_National_Park_Description,
        image = R.drawable.gatewayarchnationalpark
    )
    private val glacier = Park(
        title = R.string.Glacier_National_Park,
        description = R.string.Glacier_National_Park_Description,
        image = R.drawable.glaciernationalpark
    )
    private val greatBasin = Park(
        title = R.string.Great_Basin_National_Park,
        description = R.string.Great_Basin_National_Park_Description,
        image = R.drawable.greatbasinnationalpark
    )
    private val carlsbadCaverns = Park(
        title = R.string.Carlsbad_Caverns_National_Park,
        description = R.string.Carlsbad_Caverns_National_Park_Description,
        image = R.drawable.carlsbadcavernsnationalpark
    )
    private val whiteSands = Park(
        title = R.string.White_Sands_National_Park,
        description = R.string.White_Sands_National_Park_Description,
        image = R.drawable.whitesandsnationalpark
    )
    private val greatSmokyMountains = Park(
        title = R.string.Great_Smoky_Mountains_National_Park,
        description = R.string.Great_Smoky_Mountains_National_Park_Description,
        image = R.drawable.greatsmokymountainsnationalpark
    )
    private val theodoreRoosevelt = Park(
        title = R.string.Theodore_Roosevelt_National_Park,
        description = R.string.Theodore_Roosevelt_National_Park_Description,
        image = R.drawable.theodorerooseveltnationalpark
    )
    private val cuyahoga = Park(
        title = R.string.Cuyahoga_Valley_National_Park,
        description = R.string.Cuyahoga_Valley_National_Park_Description,
        image = R.drawable.cuyagohavalleynationalpark
    )
    private val craterLake = Park(
        title = R.string.Crater_Lake_National_Park,
        description = R.string.Crater_Lake_National_Park_Description,
        image = R.drawable.craterlakenationalpark
    )
    private val congaree = Park(
        title = R.string.Congaree_National_Park,
        description = R.string.Congaree_National_Park_Description,
        image = R.drawable.congareenationalpark
    )
    private val badlands = Park(
        title = R.string.Badlands_National_Park,
        description = R.string.Badlands_National_Park_Description,
        image = R.drawable.badlandsnationalpark
    )
    private val windCave = Park(
        title = R.string.Wind_Cave_National_Park,
        description = R.string.Wind_Cave_National_Park_Description,
        image = R.drawable.windcavenationalpark
    )
    private val bigBend = Park(
        title = R.string.Big_Bend_National_Park,
        description = R.string.Big_Bend_National_Park_Description,
        image = R.drawable.bigbendnationalpark
    )
    private val guadalupeMountains = Park(
        title = R.string.Guadalupe_Mountains_National_Park,
        description = R.string.Guadalupe_Mountains_National_Park_Description,
        image = R.drawable.guadalupemountainsnationalpark
    )
    private val arches = Park(
        title = R.string.Arches_National_Park,
        description = R.string.Arches_National_Park_Description,
        image = R.drawable.archesnationalpark
    )
    private val bryceCanyon = Park(
        title = R.string.Bryce_Canyon_National_Park,
        description = R.string.Bryce_Canyon_National_Park_Description,
        image = R.drawable.brycecanyonnationalpark
    )
    private val canyonlands = Park(
        title = R.string.Canyonlands_National_Park,
        description = R.string.Canyonlands_National_Park_Description,
        image = R.drawable.canyonlandsnationalpark
    )
    private val capitolReef = Park(
        title = R.string.Capitol_Reef_National_Park,
        description = R.string.Capitol_Reef_National_Park_Description,
        image = R.drawable.capitolreefnationalpark
    )
    private val zion = Park(
        title = R.string.Zion_National_Park,
        description = R.string.Zion_National_Park_Description,
        image = R.drawable.zionnationalpark
    )
    private val virginIslands = Park(
        title = R.string.Virgin_Islands_National_Park,
        description = R.string.Virgin_Islands_National_Park_Description,
        image = R.drawable.virginislandsnationalpark
    )
    private val shenandoah = Park(
        title = R.string.Shenandoah_National_Park,
        description = R.string.Shenandoah_National_Park_Description,
        image = R.drawable.shenandoahnationalpark
    )
    private val mountRainier = Park(
        title = R.string.Mount_Rainier_National_Park,
        description = R.string.Mount_Rainier_National_Park_Description,
        image = R.drawable.mountrainiernationalpark
    )
    private val northCascades = Park(
        title = R.string.North_Cascades_National_Park,
        description = R.string.North_Cascades_National_Park_Description,
        image = R.drawable.northcascadesnationalpark
    )
    private val olympic = Park(
        title = R.string.Olympic_National_Park,
        description = R.string.Olympic_National_Park_Description,
        image = R.drawable.olympicnationalpark
    )
    private val newRiverGorge = Park(
        title = R.string.New_River_Gorge_National_Park_and_Preserve,
        description = R.string.New_River_Gorge_National_Park_and_Preserve_Description,
        image = R.drawable.newrivegorgenationalparkandpreserve
    )
    private val grandTeton = Park(
        title = R.string.Grand_Teton_National_Park,
        description = R.string.Grand_Teton_National_Park_Description,
        image = R.drawable.grandtetonnationalpark
    )

    private val alaskaParks = listOf(
        denali,
        gatesOfTheArctic,
        glacierBay,
        katmai,
        kenaiFjords,
        kobukValley,
        lakeClark,
        wrangellStElias
    )
    private val americanSamoaParks = listOf(
        americanSamoa
    )
    private val arizonaParks = listOf(
        grandCanyon, petrifiedForest, saguaro
    )
    private val arkansasParks = listOf(
        hotSprings
    )
    private val californiaParks = listOf(
        channelIslands,
        deathValley,
        joshuaTree,
        kingsCanyon,
        lassenVolcanic,
        pinnacles,
        redwood,
        sequoia,
        yosemite
    )
    private val coloradoParks = listOf(
        blackCaynonOfTheGunnison,
        greatSandDunes,
        mesaVerde,
        rockyMountain,
    )
    private val floridaParks = listOf(
        biscayne,
        dryTortugas,
        everglades,
    )
    private val hawaiiParks = listOf(
        haleakala, hawaiiVolcanoes
    )
    private val idahoParks = listOf(
        yellowstone
    )
    private val indianaParks = listOf(
        indianaDunes
    )
    private val maineParks = listOf(
        acadia
    )
    private val michiganParks = listOf(
        isleRoyale
    )
    private val minnesotaParks = listOf(
        voyageurs
    )
    private val missouriParks = listOf(
        gatewayArch
    )
    private val montanaParks = listOf(
        glacier, yellowstone
    )
    private val nevadaParks = listOf(
        deathValley,
        greatBasin,
    )
    private val newMexicoParks = listOf(
        carlsbadCaverns, whiteSands
    )
    private val northCarolinaParks = listOf(
        greatSmokyMountains
    )
    private val northDakotaParks = listOf(
        theodoreRoosevelt
    )
    private val ohioParks = listOf(
        cuyahoga
    )
    private val oregonParks = listOf(
        craterLake
    )
    private val southCarolinaParks = listOf(
        congaree
    )
    private val southDakotaParks = listOf(
        badlands,
        windCave,
    )
    private val tennesseeParks = listOf(
        greatSmokyMountains
    )
    private val texasParks = listOf(
        bigBend, guadalupeMountains
    )
    private val utahParks = listOf(
        arches,
        bryceCanyon,
        canyonlands,
        capitolReef,
        zion,
    )
    private val VirginIslandsPark = listOf(
        virginIslands
    )
    private val virginiaParks = listOf(
        shenandoah
    )
    private val washingtonParks = listOf(
        mountRainier,
        northCascades,
        olympic,
    )
    private val westVirginiaParks = listOf(
        newRiverGorge,
    )
    private val wyomingParks = listOf(
        grandTeton, yellowstone
    )

    val states = listOf(
        State(R.string.Alaska, alaskaParks, R.drawable.alaska),
        State(R.string.American_Samoa, americanSamoaParks, R.drawable.americansamoa),
        State(R.string.Arizona, arizonaParks, R.drawable.arizona),
        State(R.string.Arkansas, arkansasParks, R.drawable.arkansas),
        State(R.string.California, californiaParks, R.drawable.california),
        State(R.string.Colorado, coloradoParks, R.drawable.colorado),
        State(R.string.Florida, floridaParks, R.drawable.florida),
        State(R.string.Hawaii, hawaiiParks, R.drawable.hawaii),
        State(R.string.Idaho, idahoParks, R.drawable.idaho),
        State(R.string.Indiana, indianaParks, R.drawable.indiana),
        State(R.string.Maine, maineParks, R.drawable.maine),
        State(R.string.Michigan, michiganParks, R.drawable.michigan),
        State(R.string.Minnesota, minnesotaParks, R.drawable.minnesota),
        State(R.string.Missouri, missouriParks, R.drawable.missouri),
        State(R.string.Montana, montanaParks, R.drawable.montana),
        State(R.string.Nevada, nevadaParks, R.drawable.nevada),
        State(R.string.New_Mexico, newMexicoParks, R.drawable.newmexico),
        State(R.string.North_Carolina, northCarolinaParks, R.drawable.northcarolina),
        State(R.string.North_Dakota, northDakotaParks, R.drawable.northdakota),
        State(R.string.Ohio, ohioParks, R.drawable.ohio),
        State(R.string.Oregon, oregonParks, R.drawable.oregon),
        State(R.string.South_Carolina, southCarolinaParks, R.drawable.southcarolina),
        State(R.string.South_Dakota, southDakotaParks, R.drawable.southdakota),
        State(R.string.Tennessee, tennesseeParks, R.drawable.tennessee),
        State(R.string.Texas, texasParks, R.drawable.texas),
        State(R.string.Utah, utahParks, R.drawable.utah),
        State(R.string.Virgin_Islands, VirginIslandsPark, R.drawable.virginislands),
        State(R.string.Virginia, virginiaParks, R.drawable.virginia),
        State(R.string.Washington, washingtonParks, R.drawable.washington),
        State(R.string.West_Virginia, westVirginiaParks, R.drawable.westvirginia),
        State(R.string.Wyoming, wyomingParks, R.drawable.wyoming)
    )
}