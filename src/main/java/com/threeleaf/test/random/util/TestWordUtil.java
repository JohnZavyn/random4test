package com.threeleaf.test.random.util;

import com.google.common.collect.ImmutableMap;
import lombok.experimental.UtilityClass;

import java.util.Map;
import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;
import static com.threeleaf.test.random.TestString.SPACE;
import static com.threeleaf.test.random.util.TestCollectionUtil.chooseOneFrom;

/** Utilities to generate random words. */
@UtilityClass
@SuppressWarnings("WeakerAccess")
public class TestWordUtil
{

    /** Common CSS color HEX values and related W3C extended color keywords. */
    public static final Map<String, String> COLORS = ImmutableMap.<String, String>builder() // @formatter:off //
          .put("#008080", "Teal")
          .put("#008b8b", "DarkCyan")
          .put("#00bfff", "DeepSkyBlue")
          .put("#00ced1", "DarkTurquoise")
          .put("#00fa9a", "MediumSpringGreen")
          .put("#00ff00", "Lime")
          .put("#00ff7f", "SpringGreen")
          .put("#00ffff", "Cyan")
          .put("#191970", "MidnightBlue")
          .put("#1e90ff", "DodgerBlue")
          .put("#20b2aa", "LightSeaGreen")
          .put("#228b22", "ForestGreen")
          .put("#2e8b57", "SeaGreen")
          .put("#2f4f4f", "DarkSlateGray")
          .put("#32cd32", "LimeGreen")
          .put("#3cb371", "MediumSeaGreen")
          .put("#40e0d0", "Turquoise")
          .put("#4169e1", "RoyalBlue")
          .put("#4682b4", "SteelBlue")
          .put("#483d8b", "DarkSlateBlue")
          .put("#48d1cc", "MediumTurquoise")
          .put("#4b0082", "Indigo ")
          .put("#556b2f", "DarkOliveGreen")
          .put("#5f9ea0", "CadetBlue")
          .put("#6495ed", "CornflowerBlue")
          .put("#663399", "RebeccaPurple")
          .put("#66cdaa", "MediumAquaMarine")
          .put("#696969", "DimGray")
          .put("#6a5acd", "SlateBlue")
          .put("#6b8e23", "OliveDrab")
          .put("#708090", "SlateGray")
          .put("#778899", "LightSlateGray")
          .put("#7b68ee", "MediumSlateBlue")
          .put("#7cfc00", "LawnGreen")
          .put("#7fff00", "Chartreuse")
          .put("#7fffd4", "Aquamarine")
          .put("#800000", "Maroon")
          .put("#800080", "Purple")
          .put("#808000", "Olive")
          .put("#808080", "Gray")
          .put("#87ceeb", "SkyBlue")
          .put("#87cefa", "LightSkyBlue")
          .put("#8a2be2", "BlueViolet")
          .put("#8b0000", "DarkRed")
          .put("#8b008b", "DarkMagenta")
          .put("#8b4513", "SaddleBrown")
          .put("#8fbc8f", "DarkSeaGreen")
          .put("#90ee90", "LightGreen")
          .put("#9370db", "MediumPurple")
          .put("#9400d3", "DarkViolet")
          .put("#98fb98", "PaleGreen")
          .put("#9932cc", "DarkOrchid")
          .put("#9acd32", "YellowGreen")
          .put("#a0522d", "Sienna")
          .put("#a52a2a", "Brown")
          .put("#a9a9a9", "DarkGray")
          .put("#add8e6", "LightBlue")
          .put("#adff2f", "GreenYellow")
          .put("#afeeee", "PaleTurquoise")
          .put("#b0c4de", "LightSteelBlue")
          .put("#b0e0e6", "PowderBlue")
          .put("#b22222", "FireBrick")
          .put("#b8860b", "DarkGoldenRod")
          .put("#ba55d3", "MediumOrchid")
          .put("#bc8f8f", "RosyBrown")
          .put("#bdb76b", "DarkKhaki")
          .put("#c0c0c0", "Silver")
          .put("#c71585", "MediumVioletRed")
          .put("#cd5c5c", "IndianRed ")
          .put("#cd853f", "Peru")
          .put("#d2691e", "Chocolate")
          .put("#d2b48c", "Tan")
          .put("#d3d3d3", "LightGray")
          .put("#d8bfd8", "Thistle")
          .put("#da70d6", "Orchid")
          .put("#daa520", "GoldenRod")
          .put("#db7093", "PaleVioletRed")
          .put("#dc143c", "Crimson")
          .put("#dcdcdc", "Gainsboro")
          .put("#dda0dd", "Plum")
          .put("#deb887", "BurlyWood")
          .put("#e0ffff", "LightCyan")
          .put("#e6e6fa", "Lavender")
          .put("#e9967a", "DarkSalmon")
          .put("#ee82ee", "Violet")
          .put("#eee8aa", "PaleGoldenRod")
          .put("#f08080", "LightCoral")
          .put("#f0e68c", "Khaki")
          .put("#f0f8ff", "AliceBlue")
          .put("#f0fff0", "HoneyDew")
          .put("#f0ffff", "Azure")
          .put("#f4a460", "SandyBrown")
          .put("#f5deb3", "Wheat")
          .put("#f5f5dc", "Beige")
          .put("#f5f5f5", "WhiteSmoke")
          .put("#f5fffa", "MintCream")
          .put("#f8f8ff", "GhostWhite")
          .put("#fa8072", "Salmon")
          .put("#faebd7", "AntiqueWhite")
          .put("#faf0e6", "Linen")
          .put("#fafad2", "LightGoldenRodYellow")
          .put("#fdf5e6", "OldLace")
          .put("#ff0000", "Red")
          .put("#ff00ff", "Magenta")
          .put("#ff1493", "DeepPink")
          .put("#ff4500", "OrangeRed")
          .put("#ff6347", "Tomato")
          .put("#ff69b4", "HotPink")
          .put("#ff7f50", "Coral")
          .put("#ff8c00", "DarkOrange")
          .put("#ffa07a", "LightSalmon")
          .put("#ffa500", "Orange")
          .put("#ffb6c1", "LightPink")
          .put("#ffc0cb", "Pink")
          .put("#ffd700", "Gold")
          .put("#ffdab9", "PeachPuff")
          .put("#ffdead", "NavajoWhite")
          .put("#ffe4b5", "Moccasin")
          .put("#ffe4c4", "Bisque")
          .put("#ffe4e1", "MistyRose")
          .put("#ffebcd", "BlanchedAlmond")
          .put("#ffefd5", "PapayaWhip")
          .put("#fff0f5", "LavenderBlush")
          .put("#fff5ee", "SeaShell")
          .put("#fff8dc", "Cornsilk")
          .put("#fffacd", "LemonChiffon")
          .put("#fffaf0", "FloralWhite")
          .put("#fffafa", "Snow")
          .put("#ffff00", "Yellow")
          .put("#ffffe0", "LightYellow")
          .put("#fffff0", "Ivory")
          .put("#ffffff", "White")
    .build(); // @formatter:on //

    /** A Set of unique adjectives. */
    public static final Set<String> WORDS_ADJECTIVES = newHashSet(( // @formatter:off //
         "abandoned able absolute adorable adventurous academic acceptable acclaimed " +
         "accomplished accurate aching acidic acrobatic active actual adept admirable " +
         "admired adolescent adored advanced afraid affectionate aged aggravating " +
         "aggressive agile agitated agonizing agreeable ajar alarmed alarming alert " +
         "alienated alive all altruistic amazing ambitious ample amused amusing anchored " +
         "ancient angelic angry anguished animated annual another antique anxious any " +
         "apprehensive appropriate apt arctic arid aromatic artistic ashamed assured " +
         "astonishing athletic attached attentive attractive austere authentic authorized " +
         "automatic avaricious average aware awesome awful awkward babyish bad back baggy " +
         "bare barren basic beautiful belated beloved beneficial better best bewitched big " +
         "big-hearted biodegradable bite-sized bitter black black-and-white bland blank " +
         "blaring bleak blind blissful blond blue blushing bogus boiling bold bony boring " +
         "bossy both bouncy bountiful bowed brave breakable brief bright brilliant brisk " +
         "broken bronze brown bruised bubbly bulky bumpy buoyant burdensome burly bustling " +
         "busy buttery buzzing calculating calm candid canine capital carefree careful " +
         "careless caring cautious cavernous celebrated charming cheap cheerful cheery " +
         "chief chilly chubby circular classic clean clear clear-cut clever close closed " +
         "cloudy clueless clumsy cluttered coarse cold colorful colorless colossal " +
         "comfortable common compassionate competent complete complex complicated composed " +
         "concerned concrete confused conscious considerate constant content conventional " +
         "cooked cool cooperative coordinated corny corrupt costly courageous courteous " +
         "crafty crazy creamy creative creepy criminal crisp critical crooked crowded " +
         "cruel crushing cuddly cultivated cultured cumbersome curly curvy cute " +
         "cylindrical damaged damp dangerous dapper daring darling dark dazzling dead " +
         "deadly deafening dear dearest decent decimal decisive deep defenseless defensive " +
         "defiant deficient definite definitive delayed delectable delicious delightful " +
         "delirious demanding dense dental dependable dependent descriptive deserted " +
         "detailed determined devoted different difficult digital diligent dim dimpled " +
         "dimwitted direct disastrous discrete disfigured disgusting disloyal dismal " +
         "distant downright dreary dirty disguised dishonest distinct distorted dizzy " +
         "dopey doting double drab drafty dramatic droopy dry dual dull dutiful each eager " +
         "earnest early easy easy-going ecstatic edible educated elaborate elastic elated " +
         "elderly electric elegant elementary elliptical embarrassed embellished eminent " +
         "emotional empty enchanted enchanting energetic enlightened enormous enraged " +
         "entire envious equal equatorial essential esteemed ethical euphoric even " +
         "evergreen everlasting every evil exalted excellent exemplary exhausted excitable " +
         "excited exciting exotic expensive experienced expert extraneous extroverted " +
         "extra-large extra-small fabulous failing faint fair faithful fake FALSE familiar " +
         "famous fancy fantastic far faraway far-flung far-off fast fat fatal fatherly " +
         "favorable favorite fearful fearless feisty feline female feminine few fickle " +
         "filthy fine finished firm first firsthand fitting fixed flaky flamboyant flashy " +
         "flat flawed flawless flickering flimsy flippant flowery fluffy fluid flustered " +
         "focused fond foolhardy foolish forceful forked formal forsaken forthright " +
         "fortunate fragrant frail frank frayed free French fresh frequent friendly " +
         "frightened frightening frigid frilly frizzy frivolous front frosty frozen frugal " +
         "fruitful full fumbling functional funny fussy fuzzy gargantuan gaseous general " +
         "generous gentle genuine giant giddy gigantic gifted giving glamorous glaring " +
         "glass gleaming gleeful glistening glittering gloomy glorious glossy glum golden " +
         "good good-natured gorgeous graceful gracious grand grandiose granular grateful " +
         "grave gray great greedy green gregarious grim grimy gripping grizzled gross " +
         "grotesque grouchy grounded growing growling grown grubby gruesome grumpy guilty " +
         "gullible gummy hairy half handmade handsome handy happy happy-go-lucky hard " +
         "hard-to-find harmful harmless harmonious harsh hasty hateful haunting healthy " +
         "heartfelt hearty heavenly heavy hefty helpful helpless hidden hideous high " +
         "high-level hilarious hoarse hollow homely honest honorable honored hopeful " +
         "horrible hospitable hot huge humble humiliating humming humongous hungry hurtful " +
         "husky icky icy ideal idealistic identical idle idiotic idolized ignorant ill " +
         "illegal ill-fated ill-informed illiterate illustrious imaginary imaginative " +
         "immaculate immaterial immediate immense impassioned impeccable impartial " +
         "imperfect imperturbable impish impolite important impossible impractical " +
         "impressionable impressive improbable impure inborn incomparable incompatible " +
         "incomplete inconsequential incredible indelible inexperienced indolent infamous " +
         "infantile infatuated inferior infinite informal innocent insecure insidious " +
         "insignificant insistent instructive insubstantial intelligent intent intentional " +
         "interesting internal international intrepid ironclad irresponsible irritating " +
         "itchy jaded jagged jam-packed jaunty jealous jittery joint jolly jovial joyful " +
         "joyous jubilant judicious juicy jumbo junior jumpy juvenile kaleidoscopic keen " +
         "key kind kindhearted kindly klutzy knobby knotty knowledgeable knowing known " +
         "kooky kosher lame lanky large last lasting late lavish lawful lazy leading lean " +
         "leafy left legal legitimate light lighthearted likable likely limited limp " +
         "limping linear lined liquid little live lively livid loathsome lone lonely long " +
         "long-term loose lopsided lost loud lovable lovely loving low loyal lucky " +
         "lumbering luminous lumpy lustrous luxurious mad made-up magnificent majestic " +
         "major male mammoth married marvelous masculine massive mature meager mealy mean " +
         "measly meaty medical mediocre medium meek mellow melodic memorable menacing " +
         "merry messy metallic mild milky mindless miniature minor minty miserable miserly " +
         "misguided misty mixed modern modest moist monstrous monthly monumental moral " +
         "mortified motherly motionless mountainous muddy muffled multicolored mundane " +
         "murky mushy musty muted mysterious naive narrow nasty natural naughty nautical " +
         "near neat necessary needy negative neglected negligible neighboring nervous new " +
         "next nice nifty nimble nippy nocturnal noisy nonstop normal notable noted " +
         "noteworthy novel noxious numb nutritious nutty obedient obese oblong oily " +
         "obvious occasional odd oddball offbeat offensive official old old-fashioned only " +
         "open optimal optimistic opulent orange orderly organic ornate ornery ordinary " +
         "original other our outlying outgoing outlandish outrageous outstanding oval " +
         "overcooked overdue overjoyed overlooked palatable pale paltry parallel parched " +
         "partial passionate past pastel peaceful peppery perfect perfumed periodic perky " +
         "personal pertinent pesky pessimistic petty phony physical piercing pink pitiful " +
         "plain plaintive plastic playful pleasant pleased pleasing plump plush polished " +
         "polite political pointed pointless poised poor popular portly posh positive " +
         "possible potable powerful powerless practical precious present prestigious " +
         "pretty previous pricey prickly primary prime pristine private prize probable " +
         "productive profitable profuse proper proud prudent punctual pungent puny pure " +
         "purple pushy putrid puzzled puzzling quaint qualified quarrelsome quarterly " +
         "queasy querulous questionable quick quick-witted quiet quintessential quirky " +
         "quixotic quizzical radiant ragged rapid rare rash raw recent reckless " +
         "rectangular ready real realistic reasonable red reflecting regal regular " +
         "reliable relieved remarkable remorseful remote repentant required respectful " +
         "responsible repulsive revolving rewarding rich rigid right ringed ripe roasted " +
         "robust rosy rotating rotten rough round rowdy royal rubbery rundown ruddy rude " +
         "runny rural rusty sad safe salty same sandy sane sarcastic sardonic satisfied " +
         "scaly scarce scared scary scented scholarly scientific scornful scratchy scrawny " +
         "second secondary second-hand secret self-assured self-reliant selfish " +
         "sentimental separate serene serious serpentine several severe shabby shadowy " +
         "shady shallow shameful shameless sharp shimmering shiny shocked shocking shoddy " +
         "short short-term showy shrill shy sick silent silky silly silver similar simple " +
         "simplistic sinful single sizzling skeletal skinny sleepy slight slim slimy " +
         "slippery slow slushy small smart smoggy smooth smug snappy snarling sneaky " +
         "sniveling snoopy sociable soft soggy solid somber some spherical sophisticated " +
         "sore sorrowful soulful soupy sour Spanish sparkling sparse specific spectacular " +
         "speedy spicy spiffy spirited spiteful splendid spotless spotted spry square " +
         "squeaky squiggly stable staid stained stale standard starchy stark starry steep " +
         "sticky stiff stimulating stingy stormy straight strange steel strict strident " +
         "striking striped strong studious stunning stupendous stupid sturdy stylish " +
         "subdued submissive substantial subtle suburban sudden sugary sunny super superb " +
         "superficial superior supportive sure-footed surprised suspicious svelte sweaty " +
         "sweet sweltering swift sympathetic tall talkative tame tan tangible tart tasty " +
         "tattered taut tedious teeming tempting tender tense tepid terrible terrific " +
         "testy thankful that these thick thin third thirsty this thorough thorny those " +
         "thoughtful threadbare thrifty thunderous tidy tight timely tinted tiny tired " +
         "torn total tough traumatic treasured tremendous tragic trained triangular tricky " +
         "trifling trim trivial troubled TRUE trusting trustworthy trusty truthful tubby " +
         "turbulent twin ugly ultimate unacceptable unaware uncomfortable uncommon " +
         "unconscious understated unequaled uneven unfinished unfit unfolded unfortunate " +
         "unhappy unhealthy uniform unimportant unique united unkempt unknown unlawful " +
         "unlined unlucky unnatural unpleasant unrealistic unripe unruly unselfish " +
         "unsightly unsteady unsung untidy untimely untried untrue unused unusual " +
         "unwelcome unwieldy unwilling unwitting unwritten upbeat upright upset urban " +
         "usable used useful useless utilized utter vacant vague vain valid valuable vapid " +
         "variable vast velvety venerated vengeful verifiable vibrant vicious victorious " +
         "vigilant vigorous villainous violet violent virtual virtuous visible vital " +
         "vivacious vivid voluminous wan warlike warm warmhearted warped wary wasteful " +
         "watchful waterlogged watery wavy wealthy weak weary webbed wee weekly weepy " +
         "weighty weird welcome well-documented well-groomed well-informed well-lit " +
         "well-made well-off well-to-do well-worn wet which whimsical whirlwind whispered " +
         "white whole whopping wicked wide wide-eyed wiggly wild willing wilted winding " +
         "windy winged wiry wise witty wobbly woeful wonderful wooden woozy wordy worldly " +
         "worn worried worrisome worse worst worthless worthwhile worthy wrathful wretched " +
         "writhing wrong wry yawning yearly yellow yellowish young youthful yummy zany " +
         "zealous zesty zigzag"
    ).split("[\\p{Punct}\\s]+")); // @formatter:on //

    /** A Set of unique adverbs. */
    public static final Set<String> WORDS_ADVERBS = newHashSet(( // @formatter:off //
        "abnormally absentmindedly accidentally acidly actually adventurously " +
        "afterwards almost always angrily annually anxiously arrogantly awkwardly " +
        "badly bashfully beautifully bitterly bleakly blindly blissfully boastfully " +
        "boldly bravely briefly brightly briskly broadly busily calmly carefully " +
        "carelessly cautiously certainly cheerfully clearly cleverly closely " +
        "coaxingly colorfully commonly continually coolly correctly courageously " +
        "crossly cruelly curiously daily daintily dearly deceivingly delightfully " +
        "deeply defiantly deliberately delightfully diligently dimly doubtfully " +
        "dreamily easily elegantly energetically enormously enthusiastically " +
        "equally especially even evenly eventually exactly excitedly extremely " +
        "fairly faithfully famously far fast fatally ferociously fervently " +
        "fiercely fondly foolishly fortunately frankly frantically freely " +
        "frenetically frightfully fully furiously generally generously gently gladly " +
        "gleefully gracefully gratefully greatly greedily happily hastily healthily " +
        "heavily helpfully helplessly highly honestly hopelessly hourly hungrily " +
        "immediately innocently inquisitively instantly intensely intently " +
        "interestingly inwardly irritably jaggedly jealously joshingly joyfully " +
        "joyously jovially jubilantly judgmentally justly keenly kiddingly kindheartedly " +
        "kindly knavishly knottily knowingly knowledgeably kookily lazily less lightly " +
        "likely limply lively loftily longingly loosely lovingly loudly loyally " +
        "madly majestically meaningfully mechanically merrily miserably mockingly " +
        "monthly more mortally mostly mysteriously naturally nearly neatly needily " +
        "nervously never nicely noisily not obediently obnoxiously oddly " +
        "offensively officially often only openly optimistically overconfidently " +
        "owlishly painfully partially patiently perfectly physically playfully " +
        "politely poorly positively potentially powerfully promptly properly " +
        "punctually quaintly quarrelsomely queasily queerly questionably questioningly " +
        "quicker quickly quietly quirkily quizzically rapidly rarely readily really " +
        "reassuringly recklessly regularly reluctantly repeatedly reproachfully " +
        "restfully righteously rightfully rigidly roughly rudely sadly safely " +
        "scarcely scarily searchingly sedately seemingly seldom selfishly " +
        "separately seriously shakily sharply sheepishly shrilly shyly silently " +
        "sleepily slowly smoothly softly solemnly solidly sometimes soon speedily " +
        "stealthily sternly strictly successfully suddenly surprisingly suspiciously " +
        "sweetly swiftly sympathetically tenderly tensely terribly thankfully " +
        "thoroughly thoughtfully tightly tomorrow too tremendously triumphantly truly " +
        "truthfully ultimately unabashedly unaccountably unbearably unethically " +
        "unexpectedly unfortunately unimpressively unnaturally unnecessarily utterly " +
        "upbeat upliftingly upright upside-down upward upwardly urgently usefully " +
        "uselessly usually vacantly vaguely vainly valiantly vastly verbally very " +
        "viciously victoriously violently vivaciously voluntarily warmly weakly " +
        "wearily well wetly wholly wildly willfully wisely woefully wonderfully " +
        "worriedly wrongly yawningly yearly yearningly yesterday yieldingly youthfully " +
        "zealously zestfully zestily"
    ).split("[\\p{Punct}\\s]+")); // @formatter:on //

    /** A Set of unique nouns. */
    public static final Set<String> WORDS_NOUNS = newHashSet(( // @formatter:off //
         "account act adjustment advertisement agreement air amount amusement angle animal " +
         "answer ant apparatus apple approval arch argument arm army art attack attempt " +
         "attention attraction authority baby back bag balance ball band base basin basket " +
         "bath bed bee behavior belief bell berry bird birth bit bite blade blood blow " +
         "board boat body bone book boot bottle box boy brain brake branch brass bread " +
         "breath brick bridge brother brush bucket building bulb burn burst business " +
         "butter button cake camera canvas card care carriage cart cat cause chain chalk " +
         "chance change cheese chess chin church circle clock cloth cloud coal coat collar " +
         "color comb comfort committee company comparison competition condition connection " +
         "control cook copper copy copy cord cork cough country cover cow crack credit " +
         "crime crush cry cup current curtain curve cushion damage danger daughter day " +
         "death debt decision degree design desire destruction detail development " +
         "digestion direction discovery discussion disease disgust distance distribution " +
         "division dog door doubt drain drawer dress drink driving drop dust ear earth " +
         "edge education effect egg end engine error event example exchange existence " +
         "expansion experience expert eye face fact fall family farm father fear feather " +
         "feeling fiction field fight finger fire fish flag flame flight floor flower fly " +
         "fold food foot force fork form fowl frame friend front fruit garden girl glass " +
         "glove goat gold government grain grass grip group growth guide gun hair hammer " +
         "hand harbor harmony hat hate head hearing heart heat help history hole hook hope " +
         "horn horse hospital hour house humor ice idea impulse increase industry ink " +
         "insect instrument insurance interest invention iron island jelly jewel join " +
         "journey judge jump kettle key kick kiss knowledge land language laugh lead " +
         "learning leather letter level lift light limit linen liquid list look loss love " +
         "low machine man manager mark market mass meal measure meat meeting memory metal " +
         "middle milk mind mine minute mist money month morning mother motion mountain " +
         "move music name nation need news night noise note number observation offer oil " +
         "operation opinion order organization ornament owner page pain paint paper part " +
         "paste payment peace person place plant play pleasure point poison polish porter " +
         "position powder power price print process produce profit property prose protest " +
         "pull punishment purpose push quality question rain range rate ray reaction " +
         "reading reason record regret relation religion representative request respect " +
         "rest reward rhythm rice river road roll room rub rule run salt sand scale " +
         "science sea seat secretary selection self sense servant sex shade shake shame " +
         "shock side sign silk silver sister size sky sleep slip slope smash smell smile " +
         "smoke sneeze snow soap society son song sort sound soup space stage start " +
         "statement steam steel step stitch stone stop story stretch structure substance " +
         "sugar suggestion summer support surprise swim system talk taste tax teaching " +
         "tendency test theory thing thought thunder time tin top touch trade transport " +
         "trick trouble turn twist unit use value verse vessel view voice walk war wash " +
         "waste water wave wax way weather week weight wind wine winter woman wood wool " +
         "word work wound writing xylophone year zebra"
    ).split("[\\p{Punct}\\s]+")); // @formatter:on //

    /** A Set of unique verbs. */
    public static final Set<String> WORDS_VERBS = newHashSet(( // @formatter:off //
        "abide accelerate accept accomplish achieve acquire acted activate adapt add " +
        "address administer admire admit adopt advise afford agree alert alight allow " +
        "altered amuse analyze announce annoy answer anticipate apologize appear applaud " +
        "applied appoint appraise appreciate approve arbitrate argue arise arrange arrest " +
        "arrive ascertain ask assemble assess assist assure attach attack attain attempt " +
        "attend attract audited avoid awake back bake balance ban bang bare bat bathe " +
        "battle be beam bear beat become beg begin behave behold belong bend beset bet " +
        "bid bind bite bleach bleed bless blind blink blot blow blush boast boil bolt " +
        "bomb book bore borrow bounce bow box brake branch break breathe breed brief " +
        "bring broadcast bruise brush bubble budget build bump burn burst bury bust buy " +
        "buze calculate call camp care carry carve cast catalog catch cause challenge " +
        "change charge chart chase cheat check cheer chew choke choose chop claim clap " +
        "clarify classify clean clear cling clip close clothe coach coil collect color " +
        "comb come command communicate compare compete compile complain complete compose " +
        "compute conceive concentrate conceptualize concern conclude conduct confess " +
        "confront confuse connect conserve consider consist consolidate construct consult " +
        "contain continue contract control convert coordinate copy correct correlate cost " +
        "cough counsel count cover crack crash crawl create creep critique cross crush " +
        "cry cure curl curve cut cycle dam damage dance dare deal decay deceive decide " +
        "decorate define delay delegate delight deliver demonstrate depend describe " +
        "desert deserve design destroy detail detect determine develop devise diagnose " +
        "dig direct disagree disappear disapprove disarm discover dislike dispense " +
        "display disprove dissect distribute dive divert divide do double doubt draft " +
        "drag drain dramatize draw dream dress drink drip drive drop drown drum dry dust " +
        "dwell earn eat edited educate eliminate embarrass employ empty enacted encourage " +
        "end endure enforce engineer enhance enjoy enlist ensure enter entertain escape " +
        "establish estimate evaluate examine exceed excite excuse execute exercise " +
        "exhibit exist expand expect expedite experiment explain explode express extend " +
        "extract face facilitate fade fail fancy fasten fax fear feed feel fence fetch " +
        "fight file fill film finalize finance find fire fit fix flap flash flee fling " +
        "float flood flow flower fly fold follow fool forbid force forecast forego " +
        "foresee foretell forget forgive form formulate forsake frame freeze frighten fry " +
        "gather gaze generate get give glow glue go govern grab graduate grate grease " +
        "greet grin grind grip groan grow guarantee guard guess guide hammer hand handle " +
        "handwrite hang happen harass harm hate haunt head heal heap hear heat help hide " +
        "hit hold hook hop hope hover hug hum hunt hurry hurt hypothesize identify ignore " +
        "illustrate imagine implement impress improve improvise include increase induce " +
        "influence inform initiate inject injure inlay innovate input inspect inspire " +
        "install institute instruct insure integrate intend intensify interest interfere " +
        "interlay interpret interrupt interview introduce invent inventory investigate " +
        "invite irritate itch jail jam jog join joke judge juggle jump justify keep kept " +
        "kick kill kiss kneel knit knock knot know label land last laugh launch lay lead " +
        "lean leap learn leave lecture led lend let level license lick lie lifted light " +
        "lighten like list listen live load locate lock log long look lose love maintain " +
        "make man manage manipulate manufacture map march mark market marry match mate " +
        "matter mean measure meddle mediate meet melt melt memorize mend mentor milk mine " +
        "mislead miss misspell mistake misunderstand mix moan model modify monitor moor " +
        "motivate mourn move mow muddle mug multiply murder nail name navigate need " +
        "negotiate nest nod nominate normalize note notice number obey object observe " +
        "obtain occur offend offer officiate open operate order organize oriented " +
        "originate overcome overdo overdraw overflow overhear overtake overthrow owe own " +
        "pack paddle paint park part participate pass paste pat pause pay peck pedal peel " +
        "peep perceive perfect perform permit persuade phone photograph pick pilot pinch " +
        "pine pinpoint pioneer place plan plant play plead please plug point poke polish " +
        "pop possess post pour practice praised pray preach precede predict prefer " +
        "prepare prescribe present preserve preset preside press pretend prevent prick " +
        "print process procure produce profess program progress project promise promote " +
        "proofread propose protect prove provide publicize pull pump punch puncture " +
        "punish purchase push put qualify question queue quit race radiate rain raise " +
        "rank rate reach read realign realize reason receive recognize recommend " +
        "reconcile record recruit reduce refer reflect refuse regret regulate " +
        "rehabilitate reign reinforce reject rejoice relate relax release rely remain " +
        "remember remind remove render reorganize repair repeat replace reply report " +
        "represent reproduce request rescue research resolve respond restored restructure " +
        "retire retrieve return review revise rhyme rid ride ring rinse rise risk rob " +
        "rock roll rot rub ruin rule run rush sack sail satisfy save saw say scare " +
        "scatter schedule scold scorch scrape scratch scream screw scribble scrub seal " +
        "search secure see seek select sell send sense separate serve service set settle " +
        "sew shade shake shape share shave shear shed shelter shine shiver shock shoe " +
        "shoot shop show shrink shrug shut sigh sign signal simplify sin sing sink sip " +
        "sit sketch ski skip slap slay sleep slide sling slink slip slit slow smash smell " +
        "smile smite smoke snatch sneak sneeze sniff snore snow soak solve soothe " +
        "soothsay sort sound sow spare spark sparkle speak specify speed spell spend " +
        "spill spin spit split spoil spot spray spread spring sprout squash squeak squeal " +
        "squeeze stain stamp stand stare start stay steal steer step stick stimulate " +
        "sting stink stir stitch stop store strap streamline strengthen stretch stride " +
        "strike string strip strive stroke structure study stuff sublet subtract succeed " +
        "suck suffer suggest suit summarize supervise supply support suppose surprise " +
        "surround suspect suspend swear sweat sweep swell swim swing switch symbolize " +
        "synthesize systemize tabulate take talk tame tap target taste teach tear tease " +
        "telephone tell tempt terrify test thank thaw think thrive throw thrust tick " +
        "tickle tie time tip tire touch tour tow trace trade train transcribe transfer " +
        "transform translate transport trap travel tread treat tremble trick trip trot " +
        "trouble troubleshoot trust try tug tumble turn tutor twist type undergo " +
        "understand undertake undress unfasten unify unite unlock unpack untidy update " +
        "upgrade uphold upset use utilize vanish verbalize verify vex visit wail wait " +
        "wake walk wander want warm warn wash waste watch water wave wear weave wed weep " +
        "weigh welcome wend wet whine whip whirl whisper whistle win wind wink wipe wish " +
        "withdraw withhold withstand wobble wonder work worry wrap wreck wrestle wriggle " +
        "wring write x-ray yawn yell zip zoom"
    ).split("[\\p{Punct}\\s]+")); // @formatter:on //

    /**
     * Get a random English adjective.
     *
     * @return an adjective
     */
    public static String randomAdjective()
    {
        return chooseOneFrom(WORDS_ADJECTIVES);
    }

    /**
     * Get a random English adverb.
     *
     * @return an adverb
     */
    public static String randomAdverb()
    {
        return chooseOneFrom(WORDS_ADVERBS);
    }

    /**
     * Get a random CSS color name.
     *
     * @return a color
     */
    public static String randomColor()
    {
        return chooseOneFrom(COLORS.values());
    }

    /**
     * Get a random CSS color hex value.
     *
     * @return a color hex
     */
    public static String randomColorHex()
    {
        return chooseOneFrom(COLORS.keySet());
    }

    /**
     * Get a random English noun.
     *
     * @return a noun
     */
    public static String randomNoun()
    {
        return chooseOneFrom(WORDS_NOUNS);
    }

    /**
     * Generate a random English phrase.
     *
     * @return a phrase
     */
    public static String randomPhrase()
    {
        return randomAdjective() + SPACE + randomNoun() + SPACE + randomVerb() + SPACE + randomAdverb();
    }

    /**
     * Get a random English verb.
     *
     * @return a verb
     */
    public static String randomVerb()
    {
        return chooseOneFrom(WORDS_VERBS);
    }
}
