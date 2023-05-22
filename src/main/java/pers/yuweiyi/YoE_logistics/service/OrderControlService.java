package pers.yuweiyi.YoE_logistics.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import pers.yuweiyi.YoE_logistics.enums.CargoTypeEnum;
import pers.yuweiyi.YoE_logistics.enums.OrderTypeEnum;
import pers.yuweiyi.YoE_logistics.pojo.dto.OrderDTO;
import pers.yuweiyi.YoE_logistics.pojo.vo.RecordVO;

import java.util.List;


/**
 * projectName: YoE-logistics-Server-Country <br/>
 * className: OrderControlService <br/>
 * description: 订单控制服务接口。 <br/>
 *
 * @author yu_weiyi 于魏祎 <a href="mailto:yu_weiyi@outlook.com" >yu_weiyi@outlook.com</a> <br/>
 * @version 1.0 <br/>
 * @since 2/9/2023 9:49 PM <br/>
 */
public interface OrderControlService {
    void insertNewOrder(String orderId, int fee, OrderDTO orderDTO);

    int calcFee(String provinceFrom, String provinceTo, CargoTypeEnum cargoType, OrderTypeEnum orderType);

    List<RecordVO> searchOrderRecords(String orderId) throws JsonProcessingException;
}
