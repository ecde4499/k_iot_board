<<<<<<< HEAD
// client.ts

import { QueryClient } from "@tanstack/react-query";

//! react query 전체 공통 설정 
// QueryClient를 만들면서, 모든 useQuery의 기본 옵션 설정
export const queryClient = new QueryClient({
  defaultOptions: {
    queries: {
      staleTime: 1000 * 30,
      refetchOnWindowFocus: false, // 창으로 돌아왔을 때 자동 refetch 할지
      retry: 1, // 실패 시 몇 번 재시도 할 지
    }
  }
})
=======
// src/query/client.ts
import { QueryClient } from "@tanstack/react-query";

export const queryClient = new QueryClient({
  defaultOptions: {
    queries: {
      staleTime: 1000 * 30, // 30초
      refetchOnWindowFocus: false,
      retry: 1,
    },
  },
});
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
