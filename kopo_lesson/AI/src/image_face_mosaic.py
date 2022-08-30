import cv2

image = cv2.imread("..\image\peopleEx3_2.jpg", cv2.IMREAD_COLOR)

gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

gray = cv2.equalizeHist(gray)

if image is None: raise Exception("이미지 읽기 실패")

face_cascade = cv2.CascadeClassifier("../data/face.xml")

faces = face_cascade.detectMultiScale(gray, 1.1, 5, 0, (100,100))

facesCnt = len(faces)

print(len(faces))

if(facesCnt) > 0:
    for face in faces:
        x, y, w, h = face

        #원본 이미지로부터 얼굴영역 가져오기
        face_image = image[y:y + h, x:x + w]

        mosaic_rate = 25

        face_image = cv2.resize(face_image, (w // mosaic_rate, h// mosaic_rate))
        face_image = cv2.resize(face_image, (w,h), interpolation = cv2.INTER_AREA)

        #원본에 내가 만든 모자이크 이미지를 덮어 씌워라
        image[y:y + h, x:x +w] = face_image
    cv2.imwrite("../result/my_image_mosaic.jpg", image)
    cv2.imshow("mosaic_image", cv2.imread("../result/my_image_mosaic.jpg", cv2.IMREAD_COLOR))
else: print("얼굴 미검출")

cv2.imshow("Face!!!", image)

cv2.waitKey(0)