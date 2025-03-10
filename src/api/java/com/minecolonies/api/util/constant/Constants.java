package com.minecolonies.api.util.constant;

import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;

/**
 * Some constants needed for the whole mod.
 */
public final class Constants
{
    public static final String MOD_ID                           = "minecolonies";
    public static final String HARVESTCRAFTMODID                = "harvestcraft";
    public static final int    ROTATE_0_TIMES                   = 0;
    public static final int    ROTATE_ONCE                      = 1;
    public static final int    ROTATE_TWICE                     = 2;
    public static final int    ROTATE_THREE_TIMES               = 3;
    public static final int    CITIZEN_RESPAWN_INTERVAL_MIN     = 10;
    public static final int    CITIZEN_RESPAWN_INTERVAL_MAX     = 600;
    public static final int    MAX_BUILDING_LEVEL               = 5;
    public static final int    TICKS_SECOND                     = 20;
    public static final int    SECONDS_A_MINUTE                 = 60;
    public static final int    STACKSIZE                        = 64;
    public static final int    MAX_BARBARIAN_HORDE_SIZE         = 400;
    public static final int    MIN_BARBARIAN_HORDE_SIZE         = 6;
    public static final int    MAX_SPAWN_BARBARIAN_HORDE_SIZE   = 10;
    public static final int    MIN_SPAWN_BARBARIAN_HORDE_SIZE   = 1;
    public static final int    MAX_BARBARIAN_DIFFICULTY         = 10;
    public static final int    DEFAULT_BARBARIAN_DIFFICULTY     = 5;
    public static final int    MIN_BARBARIAN_DIFFICULTY         = 0;
    public static final int    ENTITY_TRACKING_RANGE            = 256;
    public static final int    ENTITY_UPDATE_FREQUENCY          = 2;
    public static final int    ENTITY_UPDATE_FREQUENCY_FISHHOOK = 5;
    public static final int    UPDATE_FLAG                      = 0x03;
    public static final int    TICKS_HOUR                       = TICKS_SECOND * SECONDS_A_MINUTE * 60;
    public static final int    TICKS_FOURTY_MIN                 = TICKS_SECOND * SECONDS_A_MINUTE * 40;
    public static final int    TICKS_FIVE_MIN                   = TICKS_SECOND * SECONDS_A_MINUTE * 5;
    public static final int    MAX_PARAMS_IRECIPESTORAGE        = 9;
    public static final int    MIN_PARAMS_IRECIPESTORAGE        = 3;
    public static final int    PARAMS_ITEMSTORAGE               = 2;
    public static final int    PARAMS_RESEARCH_EFFECT           = 2;
    public static final int    PARAMS_GLOBAL_RESEARCH           = 5;
    public static final int    PARAMS_LOCAL_RESEARCH            = 3;
    public static final int    PARAMS_CUSTOM_RECIPE             = 8;
    public static final int    PARAMS_CUSTOM_RECIPE_MGR         = 13;
    public static final String DEFAULT_STYLE                    = "wooden";
    public static final String ORES                             = "ores";
    public static final double HALF_BLOCK                       = 0.5D;
    public static final double SLIGHTLY_UP                      = 0.1D;
    public static final int    ONE_HUNDRED_PERCENT              = 100;
    public static final int    VISIT_BUILDING_CHANCE            = 8;
    public static final int    WANDER_CHANCE                    = 35;
    public static final int    DOUBLE                           = 2;
    public static final int    TRIPLE                           = 3;
    public static final int    BLOCKS_PER_CHUNK                 = 16;
    public static final int    NINETY_DEGREE                    = 90;
    public static final int    HALF_ROTATION                    = 180;
    public static final int    THREE_QUARTERS                   = 270;
    public static final float  SLEEPING_RENDER_OFFSET           = -1.5F;
    public static final double DEFAULT_VOLUME                   = 0.2;
    public static final double DEFAULT_PITCH_MULTIPLIER         = 0.7D;
    public static final double XP_PARTICLE_EXPLOSION_SIZE       = 20;
    public static final double DEFAULT_SPEED                    = 0.6D;
    public static final float  WATCH_CLOSEST                    = 6.0F;
    public static final float  WATCH_CLOSEST2                   = 3.0F;
    public static final float  WATCH_CLOSEST2_FAR               = 5.0F;
    public static final float  WATCH_CLOSEST2_FAR_CHANCE        = 0.02F;
    public static final int    CHUNKS_TO_CLAIM_THRESHOLD        = 5000;

    /**
     * Advancement Criterion Names
     */
    public static final String CRITERION_SUPPLY_PLACED          = "supply_placed";
    public static final String CRITERION_STRUCTURE_PLACED       = "structure_placed";
    public static final String CRITERION_CREATE_BUILD_REQUEST   = "create_build_request";
    public static final String CRITERION_OPEN_GUI_WINDOW        = "open_gui_window";
    public static final String CRITERION_CLICK_GUI_BUTTON       = "click_gui_button";
    public static final String CRITERION_CITIZEN_EAT_FOOD       = "citizen_eat_food";
    public static final String CRITERION_BUILDING_ADD_RECIPE    = "building_add_recipe";
    public static final String CRITERION_COMPLETE_BUILD_REQUEST = "complete_build_request";
    public static final String CRITERION_COLONY_POPULATION      = "colony_population";
    public static final String CRITERION_ARMY_POPULATION        = "army_population";
    public static final String CRITERION_ALL_TOWERS             = "all_barracks_towers";
    public static final String CRITERION_DEEP_MINE              = "deep_mine";
    public static final String CRITERION_MAX_FIELDS             = "max_fields";
    public static final String CRITERION_CITIZEN_BURY           = "citizen_bury";
    public static final String CRITERION_CITIZEN_RESURRECT      = "citizen_resurrect";
    public static final String CRITERION_UNDERTAKER_TOTEM       = "undertaker_totem";

    /**
     * Placement key for item nbt
     */
    public static String PLACEMENT_NBT = "Placement";

    /**
     * Value for instant placed schematics.
     */
    public static String INSTANT_PLACEMENT = "instant";

    /**
     * Max crafting cycle depth.
     */
    public static final int MAX_CRAFTING_CYCLE_DEPTH = 20;

    /**
     * Each x blocks walked an action will be triggered to decrease saturation.
     */
    public static final int ACTIONS_EACH_BLOCKS_WALKED = 25;

    /**
     * Slot with the result of the furnace.
     */
    public static final int RESULT_SLOT = 2;

    /**
     * Slot where ores should be put in the furnace.
     */
    public static final int SMELTABLE_SLOT = 0;

    /**
     * Slot where the fuel should be put in the furnace.
     */
    public static final int FUEL_SLOT = 1;

    /**
     * Tag String of forge.
     */
    public static final int TAG_STRING = 8;

    /**
     * Tag compound of forge.
     */
    public static final int TAG_COMPOUND = 10;

    /**
     * Default size of the inventory.
     */
    public static final int DEFAULT_SIZE = 27;

    /**
     * Slots per line.
     */
    public static final int SLOT_PER_LINE = 9;

    public static final String SCIMITAR_NAME     = "iron_scimitar";
    public static final String CHIEFSWORD_NAME   = "chiefsword";
    public static final Effect LEVITATION_EFFECT = Effects.LEVITATION;
    public static final Effect GLOW_EFFECT       = Effects.GLOWING;

    public static final int GLOW_EFFECT_DURATION   = 20 * 30;
    public static final int GLOW_EFFECT_MULTIPLIER = 20;
    public static final int GLOW_EFFECT_DISTANCE   = 60;

    /**
     * The length range one patrolling operation can have on y.
     */
    public static final int UP_DOWN_RANGE = 3;

    /**
     * Max tries to find a position to path to.
     */
    public static final int MAX_TRIES = 20;

    /**
     * The number of backstories for visitors.
     */
    public static final int MAX_STORY = 20;

    /**
     * Private constructor to hide implicit public one.
     */
    private Constants()
    {
        /*
         * Intentionally left empty.
         */
    }
}
