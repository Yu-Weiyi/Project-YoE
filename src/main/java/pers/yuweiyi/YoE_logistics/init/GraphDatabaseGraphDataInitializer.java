package pers.yuweiyi.YoE_logistics.init;

import lombok.extern.slf4j.Slf4j;
import org.apache.hugegraph.driver.GraphManager;
import org.apache.hugegraph.driver.GremlinManager;
import org.apache.hugegraph.structure.constant.T;
import org.apache.hugegraph.structure.graph.Vertex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import pers.yuweiyi.YoE_logistics.enums.CargoTypeEnum;
import pers.yuweiyi.YoE_logistics.enums.PathTypeEnum;
import pers.yuweiyi.YoE_logistics.util.GraphDatabaseUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * projectName: YoE-logistics-Server-Country <br/>
 * className: GraphDatabaseGraphDataInitializer <br/>
 * description: 图数据库图数据初始化器。 <br/>
 * 虚拟行政区划模型，参考我国部分地区现实情况与行政区划修改历史，鉴于我国幅员辽阔，对行政区划图进行适当概括、简化、抽象所得。 <br/>
 * 虚拟运营布局模型，参考我国部分物流行业现实情况与运营决策，加以理想化所得。 <br/>
 *
 * @author yu_weiyi 于魏祎 <a href="mailto:yu_weiyi@outlook.com" >yu_weiyi@outlook.com</a> <br/>
 * @version 1.0 <br/>
 * @since 1/31/2023 7:53 PM <br/>
 */
@Slf4j
public class GraphDatabaseGraphDataInitializer {
    public void initializeGraphData(){
        String databaseName = GraphDatabaseUtil.databaseName;
        GraphManager graph = GraphDatabaseUtil.graphManager;

        //创建点：省级
        Vertex provinceA = graph.addVertex(T.LABEL, "province",
                "name", "A省");
        Vertex provinceB = graph.addVertex(T.LABEL, "province",
                "name", "B省");
        Vertex provinceC = graph.addVertex(T.LABEL, "province",
                "name", "C省");
        Vertex provinceD = graph.addVertex(T.LABEL, "province",
                "name", "D省");
        Vertex provinceE = graph.addVertex(T.LABEL, "province",
                "name", "E省");
        Vertex provinceF = graph.addVertex(T.LABEL, "province",
                "name", "F省");
        Vertex provinceG = graph.addVertex(T.LABEL, "province",
                "name", "G省");
        Vertex provinceH = graph.addVertex(T.LABEL, "province",
                "name", "H省");
        Vertex provinceI = graph.addVertex(T.LABEL, "province",
                "name", "I省");
        Vertex provinceJ = graph.addVertex(T.LABEL, "province",
                "name", "J省");
        Vertex provinceK = graph.addVertex(T.LABEL, "province",
                "name", "K省");
        Vertex provinceL = graph.addVertex(T.LABEL, "province",
                "name", "L省");
        log.info("Graph Database {} - Graph Data - Vertex - province: initialized", databaseName);

        //创建点：地级
        Vertex cityA1 = graph.addVertex(T.LABEL, "city",
                "name", "A1市");
        Vertex cityB1 = graph.addVertex(T.LABEL, "city",
                "name", "B1市");
        Vertex cityC1 = graph.addVertex(T.LABEL, "city",
                "name", "C1市");
        Vertex cityC2 = graph.addVertex(T.LABEL, "city",
                "name", "C2市");
        Vertex cityC3 = graph.addVertex(T.LABEL, "city",
                "name", "C3市");
        Vertex cityC4 = graph.addVertex(T.LABEL, "city",
                "name", "C4市");
        Vertex cityD1 = graph.addVertex(T.LABEL, "city",
                "name", "D1市");
        Vertex cityD2 = graph.addVertex(T.LABEL, "city",
                "name", "D2市");
        Vertex cityD3 = graph.addVertex(T.LABEL, "city",
                "name", "D3市");
        Vertex cityD4 = graph.addVertex(T.LABEL, "city",
                "name", "D4市");
        Vertex cityE1 = graph.addVertex(T.LABEL, "city",
                "name", "E1市");
        Vertex cityE2 = graph.addVertex(T.LABEL, "city",
                "name", "E2市");
        Vertex cityE3 = graph.addVertex(T.LABEL, "city",
                "name", "E3市");
        Vertex cityF1 = graph.addVertex(T.LABEL, "city",
                "name", "F1市");
        Vertex cityF2 = graph.addVertex(T.LABEL, "city",
                "name", "F2市");
        Vertex cityF3 = graph.addVertex(T.LABEL, "city",
                "name", "F3市");
        Vertex cityF4 = graph.addVertex(T.LABEL, "city",
                "name", "F4市");
        Vertex cityG1 = graph.addVertex(T.LABEL, "city",
                "name", "G1市");
        Vertex cityG2 = graph.addVertex(T.LABEL, "city",
                "name", "G2市");
        Vertex cityH1 = graph.addVertex(T.LABEL, "city",
                "name", "H1市");
        Vertex cityI1 = graph.addVertex(T.LABEL, "city",
                "name", "I1市");
        Vertex cityI2 = graph.addVertex(T.LABEL, "city",
                "name", "I2市");
        Vertex cityI3 = graph.addVertex(T.LABEL, "city",
                "name", "I3市");
        Vertex cityI4 = graph.addVertex(T.LABEL, "city",
                "name", "I4市");
        Vertex cityJ1 = graph.addVertex(T.LABEL, "city",
                "name", "J1市");
        Vertex cityJ2 = graph.addVertex(T.LABEL, "city",
                "name", "J2市");
        Vertex cityJ3 = graph.addVertex(T.LABEL, "city",
                "name", "J3市");
        Vertex cityJ4 = graph.addVertex(T.LABEL, "city",
                "name", "J4市");
        Vertex cityK1 = graph.addVertex(T.LABEL, "city",
                "name", "K1市");
        Vertex cityL1 = graph.addVertex(T.LABEL, "city",
                "name", "L1市");
        log.info("Graph Database {} - Graph Data - Vertex - city: initialized", databaseName);

        //创建边：省级<-相邻->省级
        provinceA.addEdge("adjacentProvince", provinceB);
        provinceA.addEdge("adjacentProvince", provinceC);
        provinceA.addEdge("adjacentProvince", provinceD);
        provinceA.addEdge("adjacentProvince", provinceJ);
        provinceB.addEdge("adjacentProvince", provinceA);
        provinceB.addEdge("adjacentProvince", provinceC);
        provinceB.addEdge("adjacentProvince", provinceD);
        provinceC.addEdge("adjacentProvince", provinceA);
        provinceC.addEdge("adjacentProvince", provinceB);
        provinceC.addEdge("adjacentProvince", provinceJ);
        provinceD.addEdge("adjacentProvince", provinceA);
        provinceD.addEdge("adjacentProvince", provinceB);
        provinceD.addEdge("adjacentProvince", provinceE);
        provinceD.addEdge("adjacentProvince", provinceG);
        provinceD.addEdge("adjacentProvince", provinceH);
        provinceD.addEdge("adjacentProvince", provinceJ);
        provinceE.addEdge("adjacentProvince", provinceD);
        provinceE.addEdge("adjacentProvince", provinceF);
        provinceE.addEdge("adjacentProvince", provinceH);
        provinceE.addEdge("adjacentProvince", provinceK);
        provinceE.addEdge("adjacentProvince", provinceL);
        provinceF.addEdge("adjacentProvince", provinceE);
        provinceF.addEdge("adjacentProvince", provinceG);
        provinceF.addEdge("adjacentProvince", provinceH);
        provinceF.addEdge("adjacentProvince", provinceI);
        provinceG.addEdge("adjacentProvince", provinceD);
        provinceG.addEdge("adjacentProvince", provinceF);
        provinceG.addEdge("adjacentProvince", provinceH);
        provinceG.addEdge("adjacentProvince", provinceI);
        provinceG.addEdge("adjacentProvince", provinceJ);
        provinceH.addEdge("adjacentProvince", provinceD);
        provinceH.addEdge("adjacentProvince", provinceE);
        provinceH.addEdge("adjacentProvince", provinceF);
        provinceH.addEdge("adjacentProvince", provinceG);
        provinceI.addEdge("adjacentProvince", provinceF);
        provinceI.addEdge("adjacentProvince", provinceG);
        provinceI.addEdge("adjacentProvince", provinceJ);
        provinceJ.addEdge("adjacentProvince", provinceA);
        provinceJ.addEdge("adjacentProvince", provinceC);
        provinceJ.addEdge("adjacentProvince", provinceD);
        provinceJ.addEdge("adjacentProvince", provinceG);
        provinceJ.addEdge("adjacentProvince", provinceI);
        provinceK.addEdge("adjacentProvince", provinceE);
        provinceL.addEdge("adjacentProvince", provinceE);
        log.info("Graph Database {} - Graph Data - Edge - adjacentProvince: initialized", databaseName);

        //创建边：省级--管辖->地级
        provinceA.addEdge("administer", cityA1);
        provinceB.addEdge("administer", cityB1);
        provinceC.addEdge("administer", cityC1);
        provinceC.addEdge("administer", cityC2);
        provinceC.addEdge("administer", cityC3);
        provinceC.addEdge("administer", cityC4);
        provinceD.addEdge("administer", cityD1);
        provinceD.addEdge("administer", cityD2);
        provinceD.addEdge("administer", cityD3);
        provinceD.addEdge("administer", cityD4);
        provinceE.addEdge("administer", cityE1);
        provinceE.addEdge("administer", cityE2);
        provinceE.addEdge("administer", cityE3);
        provinceF.addEdge("administer", cityF1);
        provinceF.addEdge("administer", cityF2);
        provinceF.addEdge("administer", cityF3);
        provinceF.addEdge("administer", cityF4);
        provinceG.addEdge("administer", cityG1);
        provinceG.addEdge("administer", cityG2);
        provinceH.addEdge("administer", cityH1);
        provinceI.addEdge("administer", cityI1);
        provinceI.addEdge("administer", cityI2);
        provinceI.addEdge("administer", cityI3);
        provinceI.addEdge("administer", cityI4);
        provinceJ.addEdge("administer", cityJ1);
        provinceJ.addEdge("administer", cityJ2);
        provinceJ.addEdge("administer", cityJ3);
        provinceJ.addEdge("administer", cityJ4);
        provinceK.addEdge("administer", cityK1);
        provinceL.addEdge("administer", cityL1);
        log.info("Graph Database {} - Graph Data - Edge - administer: initialized", databaseName);

        //创建边：地级<-相邻->地级
        cityA1.addEdge("adjacentCity", cityB1,
                "costDistance", 5);
        cityA1.addEdge("adjacentCity", cityC2,
                "costDistance", 8);
        cityA1.addEdge("adjacentCity", cityD2,
                "costDistance", 5);
        cityA1.addEdge("adjacentCity", cityJ2,
                "costDistance", 8);
        cityB1.addEdge("adjacentCity", cityA1,
                "costDistance", 5);
        cityB1.addEdge("adjacentCity", cityC2,
                "costDistance", 7);
        cityB1.addEdge("adjacentCity", cityD1,
                "costDistance", 5);
        cityB1.addEdge("adjacentCity", cityD2,
                "costDistance", 7);
        cityC1.addEdge("adjacentCity", cityC2,
                "costDistance", 7);
        cityC1.addEdge("adjacentCity", cityC4,
                "costDistance", 9);
        cityC2.addEdge("adjacentCity", cityA1,
                "costDistance", 8);
        cityC2.addEdge("adjacentCity", cityB1,
                "costDistance", 7);
        cityC2.addEdge("adjacentCity", cityC1,
                "costDistance", 7);
        cityC2.addEdge("adjacentCity", cityC3,
                "costDistance", 6);
        cityC2.addEdge("adjacentCity", cityJ2,
                "costDistance", 12);
        cityC3.addEdge("adjacentCity", cityC2,
                "costDistance", 6);
        cityC3.addEdge("adjacentCity", cityC4,
                "costDistance", 8);
        cityC4.addEdge("adjacentCity", cityC1,
                "costDistance", 9);
        cityC4.addEdge("adjacentCity", cityC3,
                "costDistance", 8);
        cityD1.addEdge("adjacentCity", cityB1,
                "costDistance", 5);
        cityD1.addEdge("adjacentCity", cityD2,
                "costDistance", 8);
        cityD1.addEdge("adjacentCity", cityD3,
                "costDistance", 7);
        cityD1.addEdge("adjacentCity", cityE1,
                "costDistance", 9);
        cityD2.addEdge("adjacentCity", cityA1,
                "costDistance", 5);
        cityD2.addEdge("adjacentCity", cityB1,
                "costDistance", 7);
        cityD2.addEdge("adjacentCity", cityD1,
                "costDistance", 8);
        cityD2.addEdge("adjacentCity", cityD3,
                "costDistance", 7);
        cityD2.addEdge("adjacentCity", cityJ2,
                "costDistance", 9);
        cityD3.addEdge("adjacentCity", cityD1,
                "costDistance", 7);
        cityD3.addEdge("adjacentCity", cityD2,
                "costDistance", 7);
        cityD3.addEdge("adjacentCity", cityD4,
                "costDistance", 7);
        cityD3.addEdge("adjacentCity", cityE3,
                "costDistance", 9);
        cityD3.addEdge("adjacentCity", cityG2,
                "costDistance", 7);
        cityD4.addEdge("adjacentCity", cityD3,
                "costDistance", 7);
        cityD4.addEdge("adjacentCity", cityE3,
                "costDistance", 8);
        cityD4.addEdge("adjacentCity", cityG2,
                "costDistance", 6);
        cityD4.addEdge("adjacentCity", cityH1,
                "costDistance", 6);
        cityE1.addEdge("adjacentCity", cityD1,
                "costDistance", 9);
        cityE1.addEdge("adjacentCity", cityE2,
                "costDistance", 7);
        cityE1.addEdge("adjacentCity", cityE3,
                "costDistance", 7);
        cityE1.addEdge("adjacentCity", cityL1,
                "costDistance", 15);
        cityE2.addEdge("adjacentCity", cityE1,
                "costDistance", 7);
        cityE2.addEdge("adjacentCity", cityE3,
                "costDistance", 7);
        cityE2.addEdge("adjacentCity", cityF4,
                "costDistance", 8);
        cityE2.addEdge("adjacentCity", cityK1,
                "costDistance", 15);
        cityE3.addEdge("adjacentCity", cityD3,
                "costDistance", 9);
        cityE3.addEdge("adjacentCity", cityD4,
                "costDistance", 8);
        cityE3.addEdge("adjacentCity", cityE1,
                "costDistance", 7);
        cityE3.addEdge("adjacentCity", cityE2,
                "costDistance", 7);
        cityE3.addEdge("adjacentCity", cityF3,
                "costDistance", 8);
        cityE3.addEdge("adjacentCity", cityH1,
                "costDistance", 7);
        cityF1.addEdge("adjacentCity", cityF2,
                "costDistance", 8);
        cityF1.addEdge("adjacentCity", cityI3,
                "costDistance", 10);
        cityF2.addEdge("adjacentCity", cityF1,
                "costDistance", 8);
        cityF2.addEdge("adjacentCity", cityF3,
                "costDistance", 7);
        cityF2.addEdge("adjacentCity", cityF4,
                "costDistance", 8);
        cityF2.addEdge("adjacentCity", cityG1,
                "costDistance", 7);
        cityF3.addEdge("adjacentCity", cityE3,
                "costDistance", 8);
        cityF3.addEdge("adjacentCity", cityF2,
                "costDistance", 7);
        cityF3.addEdge("adjacentCity", cityF4,
                "costDistance", 6);
        cityF3.addEdge("adjacentCity", cityH1,
                "costDistance", 6);
        cityF4.addEdge("adjacentCity", cityE2,
                "costDistance", 8);
        cityF4.addEdge("adjacentCity", cityF2,
                "costDistance", 8);
        cityF4.addEdge("adjacentCity", cityF3,
                "costDistance", 6);
        cityG1.addEdge("adjacentCity", cityF2,
                "costDistance", 7);
        cityG1.addEdge("adjacentCity", cityH1,
                "costDistance", 6);
        cityG1.addEdge("adjacentCity", cityG2,
                "costDistance", 6);
        cityG1.addEdge("adjacentCity", cityI2,
                "costDistance", 8);
        cityG2.addEdge("adjacentCity", cityD3,
                "costDistance", 7);
        cityG2.addEdge("adjacentCity", cityD4,
                "costDistance", 6);
        cityG2.addEdge("adjacentCity", cityG1,
                "costDistance", 6);
        cityG2.addEdge("adjacentCity", cityJ1,
                "costDistance", 8);
        cityH1.addEdge("adjacentCity", cityD4,
                "costDistance", 6);
        cityH1.addEdge("adjacentCity", cityE3,
                "costDistance", 7);
        cityH1.addEdge("adjacentCity", cityF3,
                "costDistance", 6);
        cityH1.addEdge("adjacentCity", cityG1,
                "costDistance", 6);
        cityI1.addEdge("adjacentCity", cityI2,
                "costDistance", 10);
        cityI1.addEdge("adjacentCity", cityI3,
                "costDistance", 10);
        cityI1.addEdge("adjacentCity", cityI4,
                "costDistance", 12);
        cityI1.addEdge("adjacentCity", cityJ3,
                "costDistance", 12);
        cityI2.addEdge("adjacentCity", cityG1,
                "costDistance", 8);
        cityI2.addEdge("adjacentCity", cityI1,
                "costDistance", 10);
        cityI2.addEdge("adjacentCity", cityI3,
                "costDistance", 9);
        cityI2.addEdge("adjacentCity", cityJ1,
                "costDistance", 9);
        cityI3.addEdge("adjacentCity", cityF1,
                "costDistance", 10);
        cityI3.addEdge("adjacentCity", cityI1,
                "costDistance", 10);
        cityI3.addEdge("adjacentCity", cityI2,
                "costDistance", 9);
        cityI4.addEdge("adjacentCity", cityI1,
                "costDistance", 12);
        cityI4.addEdge("adjacentCity", cityJ4,
                "costDistance", 14);
        cityJ1.addEdge("adjacentCity", cityG2,
                "costDistance", 8);
        cityJ1.addEdge("adjacentCity", cityI2,
                "costDistance", 9);
        cityJ1.addEdge("adjacentCity", cityJ2,
                "costDistance", 10);
        cityJ1.addEdge("adjacentCity", cityJ3,
                "costDistance", 10);
        cityJ2.addEdge("adjacentCity", cityA1,
                "costDistance", 8);
        cityJ2.addEdge("adjacentCity", cityC2,
                "costDistance", 12);
        cityJ2.addEdge("adjacentCity", cityD2,
                "costDistance", 9);
        cityJ2.addEdge("adjacentCity", cityJ1,
                "costDistance", 10);
        cityJ2.addEdge("adjacentCity", cityJ3,
                "costDistance", 10);
        cityJ3.addEdge("adjacentCity", cityI1,
                "costDistance", 12);
        cityJ3.addEdge("adjacentCity", cityJ1,
                "costDistance", 10);
        cityJ3.addEdge("adjacentCity", cityJ2,
                "costDistance", 10);
        cityJ3.addEdge("adjacentCity", cityJ4,
                "costDistance", 12);
        cityJ4.addEdge("adjacentCity", cityI4,
                "costDistance", 14);
        cityJ4.addEdge("adjacentCity", cityJ3,
                "costDistance", 12);
        cityK1.addEdge("adjacentCity", cityE2,
                "costDistance", 15);
        cityL1.addEdge("adjacentCity", cityE1,
                "costDistance", 15);
        log.info("Graph Database {} - Graph Data - Edge - adjacentCity: initialized", databaseName);

        //创建点：站点
        int commonCargoType = CargoTypeEnum.COMMON.ordinal();
        int refrigeratedCargoType = CargoTypeEnum.REFRIGERATED.ordinal();
        Set<Integer> common_refrigeratedCargoType = new HashSet<Integer>();
        common_refrigeratedCargoType.add(commonCargoType);
        common_refrigeratedCargoType.add(refrigeratedCargoType);
        Vertex stationA1a = graph.addVertex(T.LABEL, "station",
                "name", "A1a站",
                "level", 2,
                "cargoType", common_refrigeratedCargoType);
        Vertex stationB1a = graph.addVertex(T.LABEL, "station",
                "name", "B1a站",
                "level", 2,
                "cargoType", common_refrigeratedCargoType);
        Vertex stationC1a = graph.addVertex(T.LABEL, "station",
                "name", "C1a站",
                "level", 2,
                "cargoType", common_refrigeratedCargoType);
        Vertex stationC2a = graph.addVertex(T.LABEL, "station",
                "name", "C2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationC3a = graph.addVertex(T.LABEL, "station",
                "name", "C3a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationC4a = graph.addVertex(T.LABEL, "station",
                "name", "C4a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationD1a = graph.addVertex(T.LABEL, "station",
                "name", "D1a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationD2a = graph.addVertex(T.LABEL, "station",
                "name", "D2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationD3a = graph.addVertex(T.LABEL, "station",
                "name", "D3a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationD4a = graph.addVertex(T.LABEL, "station",
                "name", "D4a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationE1a = graph.addVertex(T.LABEL, "station",
                "name", "E1a站",
                "level", 2,
                "cargoType", common_refrigeratedCargoType);
        Vertex stationE2a = graph.addVertex(T.LABEL, "station",
                "name", "E2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationE3a = graph.addVertex(T.LABEL, "station",
                "name", "E3a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationF1a = graph.addVertex(T.LABEL, "station",
                "name", "F1a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationF2a = graph.addVertex(T.LABEL, "station",
                "name", "F2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationF3a = graph.addVertex(T.LABEL, "station",
                "name", "F3a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationG1a = graph.addVertex(T.LABEL, "station",
                "name", "G1a站",
                "level", 2,
                "cargoType", commonCargoType);
        Vertex stationG2a = graph.addVertex(T.LABEL, "station",
                "name", "G2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationH1a = graph.addVertex(T.LABEL, "station",
                "name", "H1a站",
                "level", 2,
                "cargoType", common_refrigeratedCargoType);
        Vertex stationI1a = graph.addVertex(T.LABEL, "station",
                "name", "I1a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationI2a = graph.addVertex(T.LABEL, "station",
                "name", "I2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationI3a = graph.addVertex(T.LABEL, "station",
                "name", "I3a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationJ1a = graph.addVertex(T.LABEL, "station",
                "name", "J1a站",
                "level", 2,
                "cargoType", commonCargoType);
        Vertex stationJ2a = graph.addVertex(T.LABEL, "station",
                "name", "J2a站",
                "level", 1,
                "cargoType", commonCargoType);
        Vertex stationK1a = graph.addVertex(T.LABEL, "station",
                "name", "K1a站",
                "level", 1,
                "cargoType", commonCargoType);
        log.info("Graph Database {} - Graph Data - Vertex - station: initialized", databaseName);

        //创建边：省级--存在->站点
        provinceA.addEdge("have", stationA1a);
        provinceB.addEdge("have", stationB1a);
        provinceC.addEdge("have", stationC1a);
        provinceC.addEdge("have", stationC2a);
        provinceC.addEdge("have", stationC3a);
        provinceC.addEdge("have", stationC4a);
        provinceD.addEdge("have", stationD1a);
        provinceD.addEdge("have", stationD2a);
        provinceD.addEdge("have", stationD3a);
        provinceD.addEdge("have", stationD4a);
        provinceE.addEdge("have", stationE1a);
        provinceE.addEdge("have", stationE2a);
        provinceE.addEdge("have", stationE3a);
        provinceF.addEdge("have", stationF1a);
        provinceF.addEdge("have", stationF2a);
        provinceF.addEdge("have", stationF3a);
        provinceG.addEdge("have", stationG1a);
        provinceG.addEdge("have", stationG2a);
        provinceH.addEdge("have", stationH1a);
        provinceI.addEdge("have", stationI1a);
        provinceI.addEdge("have", stationI2a);
        provinceI.addEdge("have", stationI3a);
        provinceJ.addEdge("have", stationJ1a);
        provinceJ.addEdge("have", stationJ2a);
        provinceK.addEdge("have", stationK1a);
        log.info("Graph Database {} - Graph Data - Edge - have: initialized", databaseName);

        //创建边：地级--设置->站点
        cityA1.addEdge("set", stationA1a);
        cityB1.addEdge("set", stationB1a);
        cityC1.addEdge("set", stationC1a);
        cityC2.addEdge("set", stationC2a);
        cityC3.addEdge("set", stationC3a);
        cityC4.addEdge("set", stationC4a);
        cityD1.addEdge("set", stationD1a);
        cityD2.addEdge("set", stationD2a);
        cityD3.addEdge("set", stationD3a);
        cityD4.addEdge("set", stationD4a);
        cityE1.addEdge("set", stationE1a);
        cityE2.addEdge("set", stationE2a);
        cityE3.addEdge("set", stationE3a);
        cityF1.addEdge("set", stationF1a);
        cityF2.addEdge("set", stationF2a);
        cityF3.addEdge("set", stationF3a);
        cityG1.addEdge("set", stationG1a);
        cityG2.addEdge("set", stationG2a);
        cityH1.addEdge("set", stationH1a);
        cityI1.addEdge("set", stationI1a);
        cityI2.addEdge("set", stationI2a);
        cityI3.addEdge("set", stationI3a);
        cityJ1.addEdge("set", stationJ1a);
        cityJ2.addEdge("set", stationJ2a);
        cityK1.addEdge("set", stationK1a);
        log.info("Graph Database {} - Graph Data - Edge - set: initialized", databaseName);

        //创建边：站点<-路径->站点
        int land = PathTypeEnum.LAND.ordinal();
        int air = PathTypeEnum.AIR.ordinal();
        int ship = PathTypeEnum.SHIP.ordinal();
        stationA1a.addEdge("path", stationB1a,
                "pathType", land,
                "costDistance", 5,
                "costTime", 5);
        stationA1a.addEdge("path", stationC1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 5);
        stationA1a.addEdge("path", stationC2a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationA1a.addEdge("path", stationD2a,
                "pathType", land,
                "costDistance", 5,
                "costTime", 5);
        stationA1a.addEdge("path", stationE1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 8);
        stationA1a.addEdge("path", stationH1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 8);
        stationA1a.addEdge("path", stationJ2a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationB1a.addEdge("path", stationA1a,
                "pathType", land,
                "costDistance", 5,
                "costTime", 5);
        stationB1a.addEdge("path", stationC2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationB1a.addEdge("path", stationD1a,
                "pathType", land,
                "costDistance", 5,
                "costTime", 5);
        stationB1a.addEdge("path", stationD2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationC1a.addEdge("path", stationA1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 5);
        stationC1a.addEdge("path", stationC2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationC1a.addEdge("path", stationC4a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationC1a.addEdge("path", stationE1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 10);
        stationC1a.addEdge("path", stationH1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 12);
        stationC1a.addEdge("path", stationJ1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 12);
        stationC2a.addEdge("path", stationA1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationC2a.addEdge("path", stationB1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationC2a.addEdge("path", stationC1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationC2a.addEdge("path", stationC3a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationC2a.addEdge("path", stationJ2a,
                "pathType", land,
                "costDistance", 12,
                "costTime", 12);
        stationC3a.addEdge("path", stationC2a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationC3a.addEdge("path", stationC4a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationC4a.addEdge("path", stationC1a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationC4a.addEdge("path", stationC3a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationD1a.addEdge("path", stationB1a,
                "pathType", land,
                "costDistance", 5,
                "costTime", 5);
        stationD1a.addEdge("path", stationD2a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationD1a.addEdge("path", stationD3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD1a.addEdge("path", stationE1a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationD2a.addEdge("path", stationA1a,
                "pathType", land,
                "costDistance", 5,
                "costTime", 5);
        stationD2a.addEdge("path", stationB1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD2a.addEdge("path", stationD1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationD2a.addEdge("path", stationD3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD2a.addEdge("path", stationJ2a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationD3a.addEdge("path", stationD1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD3a.addEdge("path", stationD2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD3a.addEdge("path", stationD4a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD3a.addEdge("path", stationE3a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationD3a.addEdge("path", stationG2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD4a.addEdge("path", stationD3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationD4a.addEdge("path", stationE3a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationD4a.addEdge("path", stationG2a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationD4a.addEdge("path", stationH1a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationE1a.addEdge("path", stationA1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 8);
        stationE1a.addEdge("path", stationC1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 10);
        stationE1a.addEdge("path", stationD1a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationE1a.addEdge("path", stationE2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationE1a.addEdge("path", stationE3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationE1a.addEdge("path", stationH1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 3);
        stationE2a.addEdge("path", stationE1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationE2a.addEdge("path", stationE3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationE2a.addEdge("path", stationK1a,
                "pathType", ship,
                "costDistance", 15,
                "costTime", 15);
        stationE3a.addEdge("path", stationD3a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationE3a.addEdge("path", stationD4a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationE3a.addEdge("path", stationE1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationE3a.addEdge("path", stationE2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationE3a.addEdge("path", stationF3a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationE3a.addEdge("path", stationH1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationF1a.addEdge("path", stationF2a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationF1a.addEdge("path", stationI3a,
                "pathType", land,
                "costDistance", 10,
                "costTime", 10);
        stationF2a.addEdge("path", stationF1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationF2a.addEdge("path", stationF3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationF2a.addEdge("path", stationG1a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationF3a.addEdge("path", stationE3a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationF3a.addEdge("path", stationF2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationF3a.addEdge("path", stationH1a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationG1a.addEdge("path", stationF2a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationG1a.addEdge("path", stationG2a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationG1a.addEdge("path", stationH1a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationG1a.addEdge("path", stationI2a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationG2a.addEdge("path", stationD3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationG2a.addEdge("path", stationD4a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationG2a.addEdge("path", stationG1a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationG2a.addEdge("path", stationJ1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationH1a.addEdge("path", stationA1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 8);
        stationH1a.addEdge("path", stationC1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 12);
        stationH1a.addEdge("path", stationD4a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationH1a.addEdge("path", stationE1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 3);
        stationH1a.addEdge("path", stationE3a,
                "pathType", land,
                "costDistance", 7,
                "costTime", 7);
        stationH1a.addEdge("path", stationF3a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationH1a.addEdge("path", stationG1a,
                "pathType", land,
                "costDistance", 6,
                "costTime", 6);
        stationH1a.addEdge("path", stationJ1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 3);
        stationI1a.addEdge("path", stationI3a,
                "pathType", land,
                "costDistance", 10,
                "costTime", 10);
        stationI2a.addEdge("path", stationG1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationI2a.addEdge("path", stationH1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationI2a.addEdge("path", stationI3a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationI2a.addEdge("path", stationJ1a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationI3a.addEdge("path", stationF1a,
                "pathType", land,
                "costDistance", 10,
                "costTime", 10);
        stationI3a.addEdge("path", stationI1a,
                "pathType", land,
                "costDistance", 10,
                "costTime", 10);
        stationI3a.addEdge("path", stationI2a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationJ1a.addEdge("path", stationC1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 12);
        stationJ1a.addEdge("path", stationG2a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationJ1a.addEdge("path", stationH1a,
                "pathType", air,
                "costDistance", 99,
                "costTime", 3);
        stationJ1a.addEdge("path", stationI2a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationJ1a.addEdge("path", stationJ2a,
                "pathType", land,
                "costDistance", 10,
                "costTime", 10);
        stationJ2a.addEdge("path", stationA1a,
                "pathType", land,
                "costDistance", 8,
                "costTime", 8);
        stationJ2a.addEdge("path", stationC2a,
                "pathType", land,
                "costDistance", 12,
                "costTime", 12);
        stationJ2a.addEdge("path", stationD2a,
                "pathType", land,
                "costDistance", 9,
                "costTime", 9);
        stationJ2a.addEdge("path", stationJ1a,
                "pathType", land,
                "costDistance", 10,
                "costTime", 10);
        stationK1a.addEdge("path", stationE2a,
                "pathType", ship,
                "costDistance", 15,
                "costTime", 15);
        log.info("Graph Database {} - Graph Data - Edge - path: initialized", databaseName);

        log.info("Graph Database {} Graph Data: All initialized", databaseName);
    }

}