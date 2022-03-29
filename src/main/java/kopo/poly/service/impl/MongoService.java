package kopo.poly.service.impl;


import kopo.poly.dto.MongoDTO;
import kopo.poly.persistance.mapper.mongodb.IMongoMapper;
import kopo.poly.service.IMongoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("MongoService")
public class MongoService implements IMongoService {

    @Resource(name="MongoMapper")
    private IMongoMapper mongoMapper;

    //생성할 컬렉션명
    private final String colNm = "MONGODB_TEST";

    @Override
    public void mongoTest() throws Exception {

        //로그 찍기(추후 찍은 로그를 통해 이 함수에 접근했는지 파악하기 용이하다.)
        log.info(this.getClass().getName() + ".mongTest Start");

        MongoDTO pDTO = new MongoDTO();
        pDTO.setUser_nm("김보규");
        pDTO.setEmail("서울@gmail.com");
        pDTO.setAddr("서울 강서구");

        //MongoDB에 데이터 저장하기
        mongoMapper.insertData(pDTO, colNm);

        //로그 찍기(추후 찍은 로그를
        log.info(this.getClass().getName() +  ".mongoTest End!");
    }
}
