package org.scoula.ex06;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

    // db에서 board테이블의 모든 row를 가지고 왔다고 가정함
    public List<BoardVO> getList(){
        List<BoardVO> list = new ArrayList<>();
        for(int i = 0; i<100; i++){
            // row하나당 vo하나
            BoardVO vo = new BoardVO(i,"tilte"+i, "content"+i, "writer"+i);
            list.add(vo);
        }

        return list;
    }
}
