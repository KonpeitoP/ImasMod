package com.KIY.imasMOD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = imasMOD.MOD_ID,
        name = imasMOD.MOD_NAME,
        version = imasMOD.MOD_VERSION,
        dependencies = imasMOD.MOD_DEPENDENCIES,
        acceptedMinecraftVersions = imasMOD.MOD_ACCEPTED_MC_VERSIONS,
        useMetadata = true
    )
public class imasMOD {
    /** ModId文字列 */
    public static final String MOD_ID = "Imas MOD";
    /** MOD名称 */
    public static final String MOD_NAME = "Imas MOD";
    /** MODのバージョン */
    public static final String MOD_VERSION = "0.0.1";
    /** 先に読み込まれるべき前提MODをバージョン込みで指定 */
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.8.9-11.15.1.1722,])";
    /** 起動出来るMinecraft本体のバージョン。記法はMavenのVersion Range Specificationを検索すること。 */
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8,1.8.9]";
    /** 追加したいアイテムのインスタンスを格納する変数。レシピ等で利用。 */
    public static Item P_Meishi;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        P_Meishi = new Item()
            .setCreativeTab(CreativeTabs.tabMaterials)          /*クリエイティブに表示されるタブ*/
            .setUnlocalizedName("P_Meishi")                     /*システム名の登録*/
            /*.setHasSubtypes(true)*/                           /*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
            /*.setMaxDamage(256)*/                              /*耐久値の設定。デフォルト0*/
            /*.setFull3D()*/                                    /*３D表示で描画させる。ツールや骨、棒等。*/
            /*.setContainerItem(Items.stick)*/                  /*クラフト時にアイテムを返却できるようにしている際の返却アイテムの指定。*/
            /*.setPotionEffect(PotionHelper.ghastTearEffect)*/  /*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
            /*.setNoRepair()*/                                  /*修理レシピを削除し、金床での修繕を出来なくする*/
            .setMaxStackSize(1);                               /*スタックできる量。デフォルト64*/
        GameRegistry.registerItem(P_Meishi,"P_Meishi");


    }
    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
