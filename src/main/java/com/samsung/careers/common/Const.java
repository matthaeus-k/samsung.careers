package com.samsung.careers.common;

import java.util.Locale;

public interface Const {
    String UTF8 = "UTF-8";
    Locale DEFAULT_LOCALE = Locale.KOREA; // 기본 Locale
    String VIEW_PATH = "web/";

    // 결과 저장용 key
    String KEY_RESULT = "result";
    String KEY_ITEM = "item";
    String KEY_ITEMS = "items";
    String KEY_PARAMS = "params";

    int FIRST_PAGE_NO = 1; // 현재 페이지 번호가 존재하지 않는 경우 사용되는 기본값
    int RECORD_COUNT_PER_PAGE = 10; // 한 페이지당 게시되는 게시물 건 수 item 갯수
    int PAGE_SIZE = 10; // 페이지 리스트에 게시되는 페이지 건수
}
