package odev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosya {
	
	//211307047-AYŞEGÜL ÇAĞLAYAN
	 static File dosya=new File("ogrenciler.txt");
	
	public static void main(String[] args) throws IOException {
		String adsoyad,bolum = null,dogumyeri,cinsiyet;
		int numara,yas;
		long telno;
		
		
			if(!dosya.exists()) {
				dosya.createNewFile();
			}else {
				Scanner scan=new Scanner(System.in);
				String secim="0";
				
				System.out.println("HOŞGELDİNİZ");
				System.out.println("************************");
				System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
				System.out.println("1-Kayıt Ekle");
				System.out.println("2-Kayıtları Listele");
				System.out.println("3-Kayıt Ara");
				System.out.println("4-Kayıt Düzenle");
				System.out.println("5-Çıkış");
				System.out.println("************************");
				
				secim=scan.next();
//*************************************************************************************************************************************************************				
				if(secim.equals("1")) {
					// *******************Kullanıcıdan bilgiler alınır****************
					Scanner girisal=new Scanner(System.in);
					System.out.println(" Adınız ve soyadınız: ");
					adsoyad=girisal.nextLine();
					System.out.println(" Numaranız: ");
					numara=girisal.nextInt();
					System.out.println(" Bölümünüz:(Lütfen boşluk bırakmadan yazınız) ");
					bolum=girisal.next();
					System.out.println(" Doğum Yeriniz(Şehir) ");
					dogumyeri=girisal.next();
					System.out.println("Cinsiyetiniz(kadın/erkek) ");
					cinsiyet=girisal.next();
					System.out.println(" Yaşınız ");
					yas=girisal.nextInt();
					System.out.println(" Telefon Numaranız( 0 ile birlikte yazınız) ");
					telno=girisal.nextLong();
					System.out.println("Kayıt Eklendi");
					
					

					//************Veriler dosyaya aktarılır*****************	
					
					String bilgi=(" Ad soyad:"+adsoyad+"| Numara: "+ numara+ " | Bölüm: " +bolum +" | Cinsiyet: "+cinsiyet+ "| Doğum Yeri: " + dogumyeri+ "| Yaş:  "+ yas+ "| Telefon Numarası: "+ telno);
					
					FileWriter fw=new FileWriter(dosya,true);
					BufferedWriter bw=new BufferedWriter(fw);
					bw.write(bilgi);
					bw.newLine();
					bw.close();
//**********************************************************************************************************************************************************			
				}else if(secim.equals("2")){
					System.out.println(" Lütfen listeleme türünü seçiniz...");
					System.out.println(" 1-Tüm Veriler");
					System.out.println(" 2-Bölüme Göre Listeleme");
					System.out.println(" 3- Cinsiyete Göre Listeleme");
					System.out.println(" 4- Yaşa göre Listeleme");
					
					Scanner listeleme=new Scanner(System.in);
					String lst;
					lst=listeleme.next();
					if(lst.equals("1")) {
						try {
						FileReader fr=new FileReader(dosya);
						String line;
						
						BufferedReader br=new BufferedReader(fr);
						while((line=br.readLine())!=null) {
							System.out.println(line);
						}
						
							br.close();
						} catch (IOException e) {
							
							e.printStackTrace();}}
									
						else if(lst.equals("2")) {
						System.out.println("Lütfen listelemek istediğiniz bölümü giriniz...")	;
						Scanner bolum2=new Scanner(System.in);
						 String secilenbolum=bolum2.next();
						   try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
					            String line;
					            while ((line = br.readLine()) != null) {
					                if (line.contains(secilenbolum)) {
					                    System.out.println(line);
					                }
					            }
					        } catch (IOException e) {
					            e.printStackTrace();
					        }
						
						
						
							
						}else if(lst.equals("3")) {
						System.out.println("Lütfen listelemek istediğiniz cinsiyeti giriniz...")	;
						Scanner cinsiyet2=new Scanner(System.in);
						 String  secilencinsiyet=cinsiyet2.next();
						   try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
					            String line;
					            while ((line = br.readLine()) != null) {
					                if (line.contains(secilencinsiyet)) {
					                    System.out.println(line);
					                }
					            }
					        } catch (IOException e) {
					            e.printStackTrace();
					        }
							
						}else if(lst.equals("4")) {
							System.out.println("Lütfen listelemek istediğiniz yaşı giriniz...")	;
							Scanner yas2=new Scanner(System.in);
							 int  secilenyas=yas2.nextInt();
							 String yass=Integer.toString(secilenyas);
							 
							   try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
						            String line;
						            while ((line = br.readLine()) != null) {
						                if (line.contains(yass)) {
						                    System.out.println(line);
						                }
						            }
						        } catch (IOException e) {
						            e.printStackTrace();
						        }

							
								
							
						}else {
							System.out.println("Lütfen Geçerli Seçim Yapınız...");
						}
						
						
						
					
					
	            }else if(secim.equals("3")) {
	            	System.out.println("Lütfen listelemek istediğiniz öğrenciyi giriniz...")	;
					Scanner adsoyad2=new Scanner(System.in);
					 String secilenadsoyad=adsoyad2.next();
					   try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
				            String line;
				            while ((line = br.readLine()) != null) {
				                if (line.contains(secilenadsoyad)) {
				                    System.out.println(line);
				                }
				            }
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
					
					
				}else if(secim.equals("4")) {
					System.out.println("Lütfen düzenlemek istediğiniz öğrenciyi giriniz...")	;
					Scanner adsoyad3=new Scanner(System.in);
					 String secilenadsoyad2=adsoyad3.next();
					   try (BufferedReader br = new BufferedReader(new FileReader(dosya))) {
				            String line;
				            while ((line = br.readLine()) != null) {
				                if (line.contains(secilenadsoyad2)) {
				                    System.out.println(line);
				                }
				            }
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
					   
					   System.out.println("Lütfen hatalı veriyi  giriniz giriniz...")	; 
					   Scanner hata=new Scanner(System.in);
						 String hata2=hata.next();
						 System.out.println("Lütfen yeni  bilgiyi  giriniz giriniz...")	; 
						   Scanner yeni=new Scanner(System.in);
							 String yeni2=yeni.next();
					   
					   
					   try {
				            
				            BufferedReader br = new BufferedReader(new FileReader(dosya));

				           
				            StringBuilder sb = new StringBuilder();
				            String line;
				            while ((line = br.readLine()) != null) {
				                sb.append(line).append("\n");
				            }
				            br.close();
				            String updatedContents = sb.toString().replace(hata2, yeni2);

				            
				            BufferedWriter bw = new BufferedWriter(new FileWriter(dosya));
				            bw.write(updatedContents);
				            bw.close();
				            System.out.println("Düzenleme İşlemi Tamamlandı");
				        } catch (IOException e) {
				            System.out.println("An error occurred while editing the file: " + e.getMessage());
				        }
				    }
				
					
				else if(secim.equals("5")) {
					
					System.out.println("Sistemden çıkış yapılıyor....");
					
					
				}else {
					
					System.out.println("Lütfen geçerli bir rakam giriniz...");
				}
				
			}
	}}
	

	
	
		
		
		
	
	
		
		
		
			
			

		
		
		
		
	
	
	
	
	
	
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		
		
	
	
	
	


