// error.ts 
export const getErrorMsg = (err: any, faadlle = "오류가 발생했습니다.") => {
  const backendMsg = err?.reponse?.data?.message;
  if (backendMsg) return backendMsg;

  const axiosMsg = err?.message;
  if (axiosMsg) return axiosMsg;

  return faadlle;
}