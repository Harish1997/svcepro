package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class teacherlist extends AppCompatActivity {

    ListView listView;

    //odd sem for first year



    String[] flautoone = {"Communicative English - Mr. R. Premraj", "Engineering Mathematics - I - Ms. A. Suba", "Engineering Physics - Dr. K. Raju", "Engineering Chemistry - Dr. S. Ananda Babu", "Basic Electrical and Electronics Engineering - Mr. P. Arul", "Engineering Drawing - Mr. E. Ravindar Rao / Dr. J. Venkatesan", "Engineering Practices Laboratory - Mr. K. Paul Durai / Mr. E. Ravindar Rao & Mr. M. Sankar / Mr. I. Venkatraman & Mr. T. Annamalai / Mr. R. Karthikeyan", "Physics and Chemistry Laboratory - Dr. S. Sampath Krishnan, Dr. K. Raju / Dr. S. Ananda Babu", "Library - Mr. R. Sakthivel", "Seminar I - Mr. G. Ravi", "Seminar II - Mr. K. Paul Durai"};

    String[] flbiotechone = {"Communicative English - Dr.T.Murugavel", "Engineering Mathematics - I - Dr.B.Saravanan", "Engineering Physics - Dr.N.R.Sheela", "Engineering Chemistry - Dr.G.Devasagayam", "Basic Electrical and Electronics Engineering - Mr.P.Muthukumaran", "Engineering Drawing - Dr.M.Gajendiran / Dr.R.Ramesh", "Engineering Practices Laboratory - Dr.V.Sridharan / Mr.G.Logachandar & Mr.R.Kannadasan / Ms.S.Sindhamani", "Physics and Chemistry Laboratory - Dr.N.R.Sheela / Dr.T.Balusamy", "Library - Ms.S.Pandi Prabha / Dr.S.Prabha", "Seminar I - Mr.N.Sathish", "Seminar II - Mr.J.Hariharan"};

    String[] flchemaone = {"Communicative English - Mr.R.Prenraj", "Engineering Mathematics - I - Dr.M.Radhakrishnan", "Engineering Physics - Dr.A.Anandavadivel", "Engineering Chemistry - Dr.G.Devasagayam", "Electrical Machines and Drives - Mr.M.Sankar", "Programming for Problem Solving - Ms.P.Leela Rani", "Engineering Practices Laboratory - Mr.E.Suresh / Mr.R.Ganesan", "Physics and Chemistry Laboratory - Dr.A.Anandavadivel / Dr.T.Balusamy", "Library - Mr.S.Rajasekar", "Special Class for Engineering Mathematics -I - Ms.P.G.Priya Darshini / Dr.M.Radhakrishnan", "Special class for Electrical Machines and Drives - Mr.S.Jai Ganesh / Mr.M.Sankar", "Special class for Programming for Problem Solving - Mr.S.Bharath / Ms.P.Leela Rani", "Special class for Engineering Mathematics - I - Ms.S.Swathi / Dr.M.Radhakrishnan"};

    String[] flchembone = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - I - Dr.D.Meiyappan", "Engineering Physics - Dr.A.Anandavadivel", "Engineering Chemistry - Dr.M.Thirumalaikumar", "Electrical Machines and Drives - Mr.G.Vinothkumar", "Programming for Problem Solving - Mr.E.Sakthivel", "Engineering Practices Laboratory - Mr.M.Kalaimani", "Physics and Chemistry Laboratory - Dr.A.Anandavadivel / Dr.T.Balusamy", "Library - Ms.G.Saraswathi", "Special Class for Engineering Mathematics -I - Ms.P.G.Priya Darshini / Dr.D.Meiyappan", "Special class for Electrical Machines and Drives - Ms.G.Saraswathi / Mr.G.Vinothkumar", "Special class for Programming for Problem Solving - Mr.S.Rajasekar / Mr.E.Sakthivel", "Special class for Engineering Mathematics - I - Dr.R.Govindarasu / Dr.D.Meiyappan"};

    String[] flcseaone = {"Communicative English - Ms.Anichamalar", "Engineering Mathematics - I - Dr.T.Kulandaivel", "Engineering Physics - Mr.J.Mohan Raj", "Engineering Chemistry - Ms.B.Preetha", "Basic Electrical and Electronics Engineering - Mr.M.Rajvikram", "Programming for Problem Solving - Dr.K.S.Gayathri", "Engineering Practices Laboratory - Mr.R.Ganesan / Mr.M.Balakumar", "Physics and Chemistry Laboratory - Mr.J.Mohan Raj / Dr.S.Anand Babu", "Programming for Problem Solving - Ms.R.Bhuvaneswari, Mr.B.PraveenKumar / Mr.T.Kumaran, Mr.T.Rajasekaran, Mr. R.Senthilkumar", "Library - Mr.C.S.Sanoj", "Seminar - Mr.T.Rajasekaran"};

    String[] flcsebone = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - I - Dr.R.Suresh", "Engineering Physics - Dr.K.Raju", "Engineering Chemistry - Ms.B.Preetha", "Basic Electrical and Electronics Engineering - Mr.I.Venkatraman", "Programming for Problem Solving - Ms.R.Bhuvaneswari", "Engineering Practices Laboratory - Mr.E.Suresh / Mr.V.Senthilvelan", "Physics and Chemistry Laboratory - Dr.K.Raju , Dr.N.Nachiappan / Dr.S.Anand Babu", "Programming for Problem Solving - Ms.R.Bhuvaneswari, Mr.B.PraveenKumar , Mr.C.S.Sanoj / Mr.T.Kumaran, Mr.P.Selvamani", "Library - Dr.K.S.Gayathri", "Seminar - Mr.T.Kumaran"};

    String[] flcsecone = {"Communicative English - Dr.Sam Dawson", "Engineering Mathematics - I - Ms.Visalakshi Subramanian", "Engineering Physics - Dr.N.R.Sheela", "Engineering Chemistry - Dr.N.Nachiappan", "Basic Electrical and Electronics Engineering - Mr.V.Mohan Raj", "Programming for Problem Solving - Ms.G.Janakasudha", "Engineering Practices Laboratory - Mr.M.Balakumar / Dr.S.Natarajan", "Physics and Chemistry Laboratory - Dr.N.R.Sheela / Dr.T.Balusamy", "Programming for Problem Solving - Ms.G.Janakasudha, Mr.T.Rajasekaran / Mr.P.Selvamani, Mr.R.Senthilkumar", "Library - Ms.R.Bhuvaneswari", "Seminar - Mr.P.Selvamani"};

    String[] flcivilone = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - I - Dr.G.Satheesh Kumar", "Engineering Physics - Ms.G.Bharathy", "Engineering Chemistry - Dr.T.Balusamy", "Basic Electrical and Electronics Engineering - Mr.N.Sathish", "Engineering Drawing - Ms.V.Tamizhselvi / Ms.Ruby Freya", "Engineering Practices Laboratory - Mr.K.Arun", "Physics and Chemistry Laboratory - Ms.G.Bharathy / Dr.N.Nachiappan", "Library - Ms.K.Sathya Priya", "Seminar I - Ms.K.Sathya Priya", "Seminar II - Mr.R.Kalaivannan"};

    String[] fleeeaone = {"Communicative English-Dr.Amutha C Sheela", "Mathematics_I-Dr.D.Meiyappan", "Engineering Physics-I-Ms.G.Bharathy", "ENgineering Chemistry-I-Dr.G.Baskar", "Basic Civil and Mechanical Engineering-Mr.K.Arun/Mr.G.K.Kirubakaran", "Programming for Problem Solving-Ms.V.Saroja", "Programming for problem solving-Ms.V.Saroja*,Ms.K.Kiruthika Devi,Ms.Kruba Wesley,Mr.A.R.Guru Gokul", "Engineering Practise Laboratory-Mr.M.Kalaimani/K.Ram Prasad,Ms.M.Rajalakshmi*","Library-Mr.T.Annamalai", "Seminar1-Mr.S.Sudharsanam","Seminar 2-Ms.M.Rajalakshmi","Seminar 3-Ms.M.Maadhuri","Sports-Dr.R.K.Kannadasan/Mr.M.Ravivikram/Ms.M.Maadhuri"};

    String[] fleeebone = {"Communicative English-Ms.S.B.Lavanya", "Mathematics-I-Dr.G.Satheesh Kumar", "Engineering Physics-I-Ms.S.KAlpana", "Engineering Chemistry-I-Dr.G.Baskar","Basic Civil and Mechanical Engineering-Mr.K.Arun/Mr.E.Suresh","Programming for problem solving-Ms.K.Kiruthika Desvi", "Programming for problem solving Laboratory-Ms.K.Kiruthika Devi,Ms.N.Devi,Ms.J.Sharon Ranjitha Esther,Ms.K.Nivethaa Shree", "Engineering Practise Laboratory-Mr.S.Yeshwanthraj,Dr.R.Kannadasan*", "Library-Mr.M.Shankar", "Seminar 1-Mr.A.Tamilselvan","Seminar 2-Dr.R.Kannadan","Seminar 3-Mr.G.Vinothkumar","Ms.M.Rajalakshmi"};

    String[] fleceaone = {"Communicative English - Mr.P.Ganapathy", "Engineering Mathematics - I - Dr.S.Prabhu", "Engineering Physics - Mr.J.Mohan Raj", "Engineering Chemistry - Dr.T.Balusamy", "Basic Electrical Engineering - Ms.S.Radhika", "Engineering Drawing - Mr.S.Muniraj / Mr.G.Kirubakaran", "Engineering Practices Laboratory - Mr. T. Annamalai / Mr.K.Ramprasad , Mr.M.Kalaimani", "Physics and Chemistry Laboratory - Mr.J.Mohan Raj / Dr.T.Balusamy", "Library - Ms.M.Vidya", "Seminar I - Ms.S.Sangeethapriya / Mr.B.Nethaji", "Sports - Mr.R.Nagaraj"};

    String[] flecebone = {"Communicative English-Ms.S.B.Lavanya", "Mathematics-I-Dr.V.Valliammai", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-Dr.T.Balusamy", "Basic Electrical and Electronics Engineering-Mr.G.Loganathan", "Engineering Drawing-Mr.M.Kalaimani/Mr.R.Ganesan","Engineering Practices-Ms.K.S.Pavithra/Mr.G.Logachander,Dr.V.Sridharan", "Physics/Chemistry Lab-K.Raju/Dr.S.Sampath Kumar/Dr.S.Ananda Babu,", "Library-Ms.A.Bharathipriya","Seminar-Ms.Rajeshwari Ramaraj/Mr.N.Kumaran","Sports-Ms.A.Bharathipriya"};

    String[] flececone = {"Communicative English-Mr.Premraj", "Mathematics-I-Dr.T.Kulandaivel", "Engineering Physics-I-Dr.N.R.Sheela", "Engineering Chemistry-I-Ms.B.Preetha", "Basic Electrical and Electronics Engineering-Ms.M.Vidya","Engineering Drawing-Mr.R.Ganesan/Mr.M.Balakumar", "Engineering Practices Laboratory-Mr.G.Vinoth Kumar,Mr.V.Senthilvelan,Mr.M.Nishal", "Physics/Chemistry Lab-Dr.N.R.Sheela,Ms.G.Bharathy/Ms.B.Preetha", "Library-Ms.S.M.Mehzabeen","Seminar-M.M.Vidya,Mr.N.Kumaran","Sports-Mr.N.Sathish"};

    String[] flitaone = {"Communicative English-Ms.Anichamalar", "Mathematics-I-Dr.B.Saravanan", "Engineering Physics-I-Ms.G.Bharathy", "Engineering Chemistry-I-Dr.S.Ananda Babu", "Basic Electricals and Electronics Engineering-Ms.M.Maadhuri", "Programming for problem solving-Mr.V.M.Sivagami", "Engineering Practices Laboratory-Mr.T.Annamalai,Ms.M.Rajalakshmi,Ms.K.Suganthi,Mr.S.Kumaravel/M.M.K.Kalaimani/Mr.K.Ramprasad", "Physics/Chemistry Lab-Ms.G.Bharathy/Dr.S.Ananda Babu", "Programming for prolem solving lab-Ms.P.Leela Rani,Ms,S,Jerusha,Mr.E.Sakthivel,Mr.E.Sivakumar","Library-Ms.V.Saroja","Sports-Dr.C.Yaashuwanth,Mr.V.Ranjith,Mr.E.Sakthivel"};

    String[] flitbone = {"Communicative English-Ms.S.B.Lavanya", "Mathematics-I-Dr.D.Valliammal", "Engineering Physics-I-Ms.S.Kalpana", "Engineering Chemistry-I-Dr.S.Ananthababu", "Basic Electricals and Electronics Engineering-Ms.S.Sinthamani", "Programming for problem solving-Mr.M.Rajvikram,MR.M.RanjithKumar,Mr.C.Gopinath,Ms.S.Arulmozhi,Mr.E.Suresh/Mr.V.Senthilvelan",  "Physics/Chemistry Lab-Ms.S.Kalpana,Dr.A.Bhaskaran/Dr.G.Baskar","Programming for problem solving lab-Ms.N.Devi,Ms.K.Kiruthika Devi,Mr.V.Ranjith,Mr.S.Uvaraj Arutkumaran", "Library-Ms.N.Devi","Sports-Ms.Sharon Ranjitha Esther,Ms.N.Devi,Ms.K.Kiruthika Devi"};

    String[] flmechaone = {"Communicative English-Dr.Sam Dawson", "Mathematics-I-Ms.A.Suba", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-Dr.S.Sternly", "Basic Electricals and Electronics Engineering-Ms.M.Anushya", "Engineering Drawing-Dr.M.Premananth/Mr.G.Logachandar",  "Engineering Practices Laboratory-Mr.E.Suresh", "Physics/Chemistry Lab-Mr.J.Mohan Raj,Ms.S.Kalpana/Dr.S.Sternly", "Seminar 1,2- Mr.G.Suresh,Mr.E.Suresh","Sports-Dr.P.Raghu,Dr.M.Ganjendiran,Mr.G.Suresh"};

    String[] flmechbone = {"Communicative English-Dr.Amutha C Sheela", "Mathematics-I-Dr.M.Radhakrishnan", "Engineering Physics-I-Ms.S.Kalpana", "Engineering Chemistry I-Dr.S.Sternly", "Basic Electricals and Electronics Engineering-Mr.R.Nagaraj", "Engineering Drawing-Mr.M.Nishal/Mr.M.Maheshwaran",  "Engineering Practices Laboratory-Mr.M.Nishal/Mr.V.Senthilvelan", "Physics/Chemistry Lab-Ms.S.Kalpana/Dr.S.Stanly","Library-Mr.M.Kalaimani,Mr.S.Yeshwant Raj","Sports-Mr.M.Maheshwaran,Mr.M.Kalaimani,Mr.S.Yeshwant Raj"};

    String[] flmarineone = {"Communicative English-Mr.P.Ganapathy", "Mathematics-I-Dr.R.Suresh", "Engineering Physics-I-Dr.S.Sampathkrishnan", "Engineering Chemistry I-Dr.S.Stanly Samuel", "Basic Electricals and Electronics Engineering-Dr.R.Gayathri", "Engineering Drawing-Mr.S.G.Karthik/Mr.V.Gurusamy",  "Engineering Practices Laboratory-Mr.S.G.KArthik/Mr.B.Srivathsan/Ms.S.Sinthamani/Ms.S.Anitha/Ms.K.S.PAvithra/Ms.M.Rajalakshmi", "Physics/Chemistry Lab-Dr.A.Bhaskaran/Dr.S.Stanly Samuel","Library-Mr.J.Arun Chakkravathy/Prof.T.R.Mohan,Dr.M.Anandan/Karnam Dileep","Seminar-Prof.K.V.Sivanarayanan/Mr.V.Gurusamy/Mr.B.Srivathsan/Mr.S.G.Gayathri"};

    Integer r, x, y, z, t, d;

    //below is the teachers list for first year second sem
    //method used - (fl)+(dept)+(section if available)+(semester)
    //fl stands for faculty list

    String[] flautotwo = {"Technical English-II-Mr.Sakthivel", "Mathematics-II-Dr.S.Prabhu", "Engineering Physics-II-Ms.S.Kalpana", "Engineering Chemistry-II-Dr.G.Baskar", "Basic Electrical and Electronics Engg-Mr.G.Vinothkumar", "Engineering mechanics-Dr.V.Ganesh/Mr.K.Paul Durai", "Computer Aided Drafting and Modeling Laboratory-Mr.R.Sakthivel/Mr.E.Ravindar Rao/Mr.A.K.Boobala Senthilraj/Mr.K.E.Kumaraguru", "Physics and Chemistry Laboratory-II-Ms.S.Kalpana/Dr.G.Baskar", "Library-Mr.A.K.Boobala Senthilraj"};

    String[] flbiotechtwo = {"Technical English-II-Ms.Lavanya", "Mathematics-II-Ms Visalakshi Subramanian", "Physics of Materials-Ms.S.Kalpana", "Chemistry of Technologists-Dr.M.Thirumalaikumar", "Biochemistry-Dr.S.Prabhu", "Microbiology-Ms.P.Jaibiba", "Biochemistry Laboratory-Ms.Pandi Prabha", "microbiology Laboratory-Ms.P.Jaibiba,Library-Mr.N.Sathish"};

    String[] flchematwo = {"Technical English-II-Mr.Sakthivel", "Mathematics-II-Dr.D.Meiyappan", "Engineering Physics-II-Mr.S.Harikrishnan", "Engineering Chemistry-II-Dr.S.Selvakumar", "Basic Electrical and Electronics Engineering-Mr.SV.Sreeraj", "Engineering Mechanics-Dr.K.E.K.Vimal", "Computer Programming Laboratory-Ms.Sharon Ranjitha Esther/Ms.U.Poornima/Ms.A.Indhumathi/Mr.Sakthivel/Ms.Kiruba Wesley", "Basic Electrical and Electronics Laboratory-Mr.SV Sreeraj/Ms.S.Angala Vaihnavi", "Physics and Chemistry Laboratory-II-Mr.S.Harikrishnan/Dr.S.Selvakumar"};

    String[] flchembtwo = {"Technical English-II-Ms.Lavanya", "Mathematics-II-Ms.Visalakshmi Subramanian", "Engineering Physics-II-Dr.N.R.Sheela", "Engineering Chemistry-II-Dr.S.Selvakumar", "Basic Electrical and Electronics Engineering-Ms.S.Angala Vaishnavi", "Engineering Mechanics-Mr.R.Ganesan", "Computer Programming Laboratory-Ms.C.Silambarasi/Ms.M.Sugacini/Ms.S.Jerusha/Ms.N.Uma", "Basic Electrical and Electronics Laboratory-Mr.SV Sreeraj/Ms.S.Angala Vaihnavi", "Physics and Chemistry Laboratory-II-Mr.S.Harikrishnan/Dr.S.Selvakumar"};

    String[] flciviltwo = {"Technical English-II-Dr.Amutha Charu Sheela", "Mathematics-II-Ms.A.Subha", "Engineering Physics-II-Dr.K.Raju", "Engineering Chemistry-II-Ms.B.Preetha", "Basic Electrical and Electronics Engineering-Dr.R.Karthikeyan", "Engineering Mechanics-Ms.K.Sathya Priya/Ms.Ruby Freya(Tut)", "Computer Aided Drafting and Modeling Laboratory-Ms.K.Sathya Priya/Ms.C.Sandhiya", "Physics and Chemistry Laboratory-II-Dr.K.Raju/Ms.B.Preetha", "Library-Mr.G.Arun"};

    String[] flcseatwo = {"Technical English-II-Dr.T.Murugavel", "Mathematics-II-Ms.A.Subha", "Engineering Physics-II-Dr.N.R.Sheela", "Engineering Chemistry-II-Dr.N.Nachiappan", "Digital Principles and System Design-Mr.A.Sowmyanarayanan", "Programming and Data Structures-I-Ms.S.Rajalakshmi", "Digital Laboratory-Mr.A.Sowmyanarayanan/Ms.E.Rajalakshmi/Ms.S.U.Muthunagai", "Programming and Data Structures Laboratory-I-Ms.S.Rajalakshmi/Ms.S.Poorani/Ms.K.S.Gayathri", "Physics and Chemistry Laboratory-II-Dr.N.R.Sheela/Dr.T.Balusamy", "Library-Mr.S.Yuvaraj"};

    String[] flcsebtwo = {"Technical English-II-Ms.S.Anichamalar", "Mathematics-II-Mr.P.Veeriah", "Engineering Physics-II-Ms.G.Bharathy", "Engineering Chemistry-II-Dr.N.Nachiappan", "Digital Principles and System Design-Ms.E.Rajalakshmi", "Programming and Data Structures-I-Ms.J.M.Gnanasekar", "Digital Laboratory-Ms.E.Rajalakshmi/Ms.R.Bhuvaneswari", "Programming and Data Structures Laboratory-I-Ms.U.Abirami/Ms.S.Poorani/Ms.S.K.Umamaheswari", "Physics and Chemistry Laboratory-II-Mr.S.Harikrishnan/Dr.R.Raja", "Library-Mr.S.Yuvaraj"};

    String[] flcsectwo = {"Technical English-II-Mr.PremRaj", "Mathematics-II-Dr.S.Prabhu", "Engineering Physics-II-Dr.A.Anandavadivel", "Engineering Chemistry-II-Dr.G.Baskar", "Digital Principles and System Design-Mr.R.Bhuvaneswari", "Programming and Data Structures-I-Ms.U.Abirami", "Digital Laboratory-Mr.A.Sowmyanarayanan/Ms.R.Bhuvaneswari/Ms.K.Kumanan(C2)", "Programming and Data Structures Laboratory-I-Ms.U.Abirami/Ms.S.Rajalakshmi/Ms.S.U.Umamaheswari", "Physics and Chemistry Laboratory-II-Dr.A.Anandavadivel/Dr.G.Baskar", "Library-Ms.D.Sasikala"};

    String[] fleceatwo = {"Technical English-II-Mr.Sam Dawson", "Mathematics-II-Ms.M.Ramya", "Engineering Physics-II-Dr.S.Sampath Krishnan", "Engineering Chemistry-II-Dr.M.Thirumalai Kumar", "Electronic Devices-Mr.S.R.Balasubramanian/Ms.T.J.Jeyaprabha(T-Tutorial)", "Circuit Theory-Ms.R.Kousalya/Ms.S.R.Malathi(T1-Tutorial 1)/Ms.A.Bharathipriya(T2-Tutorial2)", "Circuit and Devices Laboratory-Mr.M.H.Masood/Ms.Rajeswari Ramaraj/Mr.G.Loganathan/Mr.N.Sathish", "Physics and Chemistry Laboratory-II-Dr.S.Sampath Krishnan/Dr.N.Nachiappan", "Library-Mr.P.Arul"};

    String[] flecebtwo = {"Technical English-II-Ms.Anichamalar", "Mathematics-II-Mr.R.Suresh", "Engineering Physics-II-Ms.G.Bharathy", "Engineering Chemistry-II-Dr.G.Devasagayam", "Electronic Devices-Mr.S.Saravanan/Mr.S.R.Balasubramanian(T-Tutorial)", "Circuit Theory-Mr.K.Varadarajan/Ms.K.Srividhya(T1-Tutorial 1)/Mr.N.Kumaran(T2-Tutorial2)", "Circuit and Devices Laboratory-Ms.B.Sarala/Mr.P.Muthukumaran/Mr.M.Duraisamy/Ms.A.Bharathipriya", "Physics and Chemistry Laboratory-II-Ms.G.Bharathy/Dr.G.Devasagayam", "Library-Mr.B.Nethaji"};

    String[] flecectwo = {"Technical English-II-Mr.R.Premraj", "Mathematics-II-Dr.T.Kulandaivel", "Engineering Physics-II-Mr.S.HariKrishnan", "Engineering Chemistry-II-Ms.B.Preetha", "Electronic Devices-Mr.A.Bharathipriya/Ms.T.J.Jeyaprabha(T-Tutorial)", "Circuit Theory-Ms.B.Sarala/Ms.K.srividhya(T1-Tutorial 1)/Ms.A.Bharathipriya(T2-Tutorial2)", "Circuit and Devices Laboratory-Ms.B.Sarala/Ms.S.M.Mehzabeen/Mr.B.Nethaji/Mr.A.BharathiPriya", "Physics and Chemistry Laboratory-II-Mr.S.HariKrishnan/Dr.T.Balusamy", "Library-Mr.R.Nagaraj"};

    String[] fleeeatwo = {"Technical English-II-Mr.Ganapathy", "Mathematics-II-Dr.T.Kulanthaivel", "Engineering Physics-II-Dr.N.R.Sheela", "Engineering Chemistry-II-Dr.S.Ananda Babu", "Basic Civil and Mechanical Engineering-Mr.G.Kirubakaran/Ms.C.Sandhiya", "Circiut Theory-Ms.S.Arulmozhi", "Computer Programming Laboratory-Mr.V.Ranjith/Ms.J.Sharon Ranjitha Esther/Ms.A.Rohini/Ms.A.Indumathi", "Electric Circuits Laboratory-Ms.S.Arulmozhi(I/C),Ms.S.Anitha,Mr.C.kamal,Ms.A.Deepak", "Physics and chemistry Laboratory-II-Dr.N.Sheela/Dr.N.Nachiappan"};

    String[] fleeebtwo = {"Technical English-II-Mr.Sam Dawson", "Mathematics-II-Dr.D.Meiyappan", "Engineering Physics-II-Dr.K.Raju", "Engineering Chemistry-II-Dr.T.Balu samy", "Basic Civil and Mechanical Engineering-Mr.G.Kirubakaran/Ms.S.Diravia Balan", "Circiut Theory-Ms.A.Tamizhselvan", "Computer Programming Laboratory-Ms.V.M.Megala/Mr.J.Sharon Ranjitha Esther/Ms.V.Ranjith/Mr.E.Sakthivel", "Electric Circuits Laboratory-Ms.A.Tamizhselvan(I/C),Ms.S.Anitha,Mr.C.kamal,Ms.K.S.Pavithra", "Physics and chemistry Laboratory-II-Dr.S.Harikrishnan/Dr.T.Balu Samy"};

    String[] flitatwo = {"Technical English II-Mr.P.Sakthivel","Mathematics-II-Mr.P.Veeraiah","Engneering Physics-II-Ms.S.Kalpana","Engineering Chemistry-II-Dr.R.Raja","DPSD-Dr.C.Yaashuwanth","PDS-I-Ms.U.Pooranima","Digital Laboratory-Dr.C.Yaashuwanth/MS.V.M.Meghala/Ms.M.Sugacini/Mr.V.Ranjith","PDS Lab I-Ms.U.Pooranima/Ms.K.Krithika Devi/Ms.S.Kalavathi/Ms.D.Jayanthi","Phy and Chem Lab II-Ms.S.Kalpana/Dr.R.Raja","Library-Ms.V.M.Meghala"};

    String[] flitbtwo = {"Technical English II-Dr.T.Ravindran","Mathematics II-Ms.Visalakshi Subramanian","Engineering Physics II-Dr.A.Anandhavadivel","Engineering Chemistry II-Dr.R.Raja","DPSD -Mr.K.Suresh","PDS I-Ms.L.Anita Elizabeth","Digital Lab-Mr.K.Suresh/Mr.V.Ranjith/Mr.AR.Guru Gokul/Ms.M.Sugacini","PDS I-Ms.L.Anita Elizabeth/Ms.P.Nirmala/Ms.A.Kala/Ms.P.Sharon Femi"};

    String[] flmechatwo = {"Technical English II-Dr.Amutha Charu Sheela","Mathematics II-Ms.N.Priya","Engineering Physics II-Ms.G.Bharathy","Engineering Chemistry II-Dr.S.AnandaBabu","BEEE-Mr.I.Venkatraman","Engineering Mechanics-Dr.M.Premananth","Computer Aided Drafting and Modeling Lab-Mr.M.Kalaimani/Mr.E.Suresh/Mr.R.Ganesan/Mr.J.Sivaramapandian","Phy and Chem Lab II-Ms.G.Bharathy/Dr.S.AnandaBabu","Library-Dr.M.Ananth Kumar"};

    String[] flmechbtwo = {"Technical English II-Ms.Lavanya","Mathematics II-Dr.V.Valliammal","Engineering Physics II-Dr.A.Bhaskaran","Engineering Chemistry II-Dr.T.Balaswamy","BEEE-Mr.I.Venkatraman","Engineeering Mechanics-Ms.S.Muniraj","Computer Aided Drafting and Modelling Lab-Dr.S.Kalyansundaram/Mr.M.ArulKumar/Mr.M.Maheswaran/Ms.S.Muniraj","Phy and Chem Lab II-Dr.A.Bhaskaran/Dr.S.AnandabaBabu","Library-Dr.M.Mohandass"};
    //below is d teachers list for second yr ,third yr and fourth year

    //method used - (fl)+(dept)+(section if available)+(semester)

    String[] flautofour = {"Automotive Chassis - Mr.R.Sakthivel", "Mechanics of Machines - Mr.K.E.Kumaraguru", "Electronics and Microcontroller - Dr.S.Ganesh Vaidyanathan", "Environmental Science and Engineering - Dr.Nalinkanth V.Ghone", "Computational Methods - Dr.R.Umadevi", "Fluid Mechanics and Machinery - Mr.A.Balasubramanian", "Automotive Components Laboratory - Dr.V.Ganesh/Mr.K.Paul Durai", "Electronics and Microcontroller Laboratory - Ms.B.Hemalatha/Ms.S.M.Mehzabeen/Mr.N.Sathish", "Fluid Mechanics and Machinery Laboratory - Mr.G.Ravi/Mr.E.Ravindar Rao"};

    String[] flautosix =  {"Automotive Air - Conditioning - Dr.V.Ganesh", "Alternative Fuels and Energy Systems - Mr.K.Paul Durai", "Automotive Engine Components Design - Mr.E.Ravindar Rao/Mr.A.Balasubramanian", "Automotive Chassis Components Design - Mr.Ramanjaneyulu Kolla/Mr.J.Dhanabal", "Two and Three Wheelers - Mr.A.K.Boobalasenthilraj", "Vehicle Dynamics - Mr.R.Sakthivel/Dr.V.Ganesh", "Principles of Management - Dr.S.Premnath", "Computer Aided Engine and Chassis Design Lab - Mr.E Ravindar Rao/Mr.K.E.Kumaraguru/Mr.Ramanjaneyulu Kolla", "Two and Three Wheelers Lab - Dr.S.Premnath/Mr.J.Dhanabal", "Library - Dr.S.Premnath", "Placement 1 - Mr.K.Paul Durai", "Placement 2 - Mr.A.Balasubramanian", "Seminar - Dr.S.Premnath"};

    String[] flautoeight =  {"Transport Management - Dr.J.Venkatesan", "Vehicle Body Engineering - Mr.Ramanjaneyulu Kolla", "Project Work - Dr.V Ganesh", "Operations Research - Mr.J.Dhanabal"};

    String[] flbiotechfour = {"Probability and Statistics - Dr.B.Thilaka", "Analytical Methods and Instrumentation - Ms.S.Pandi Prabha", "Applied Thermodynamics for Biotechnologists - Mr.P.K.Praveen Kumar/Mr.D.Nilavunesan", "Heat and Momentum Transfer Operations - Ms.V.Sumitha/Dr.A.Senthil Nagappan", "Enzyme Technology and Biotransformation - Mr.D.Suresh Kumar/Mr.S.Naga Vignesh", "Bioprocess Principles - Mr.S.Naga Vignesh/Mr.P.K.Praveen Kumar", "Chemical Engineering Lab - Mr.P.K.Praveen Kumar/Dr.A.Senthil Nagappan", "Instrumental Methods of Analysis Lab - Dr.S.Prabhu/Ms.P.Jaibiba", "Library - Mr.J.Hariharan", "Seminar - Dr.S.Prabhu"};

    String[] flbiotechsix = {"Total Quality Management For Biotechnologists - Ms.N.Kanagam", "Immunology - Prof.R.B.Narayanan", "Genetic Engineering And Genomics - Mr.J.Hariharan", "Chemical Reaction Engineering - Mr.D.Nilavunesan/Mr.S.Naga Vignesh", "Molecular Pathogenesis of Infectious Disease - Prof.Sulochana Somasundaram", "Animal Biotechnology - Mr.N.Sathish", "Metabolic Engineering - Dr.A.Senthil Nagappan/Mr.N.Sathish", "IPR and Ethical Issues in Biotechnology - Mr.D.Nilavunesan", "Genetic Engineering Lab - Mr.N.Sathish/Mr.J.Hariharan/Prof.Sulochana Somasundaram", "Bioprocess Lab II - Ms.V.Sumitha/Mr.D.Suresh Kumar", "Communication and Soft Skills - Lab Based - Dr.C.Amutha Charu Sheela/Ms.Anichamalar", "Library - Ms.N.Kanagam", "Seminar - Mr.D.Suresh Kumar"};

    String[] flbiotecheight = {"Project Work - Prof.E.Nakkeeran", "Library - Ms.S.Pandi Prabha"};

    String[] flchemafour = {"Probability and Statistics - Dr.A.R.Vijayalakshmi", "Chemical Process Calculations - Ms.S.Swathi", "Chemical Engineering Thermodynamics I - Dr.D.Swaminathan", "Mechanical Operations - Mr.S.Jaiganesh", "Heat Transfer - Dr.C.Anand Babu", "Instrumental Methods of Analysis - Dr.M.Thirumalaikumar", "Technical Analysis Lab - Dr.M.Thirumalaikumar/Mr.D.Sivakumar", "Fluid Mechanics Lab - Ms.S.Swathi/Dr.M.Yogesh Kumar","Library - Dr.M.Yogesh Kumar"};

    String[] flchemasix = {"Energy Engineering - Mr.B.S.Vishal", "Chemical Reaction Engineering I - Ms.D.Durgadevi", "Mass Transfer II - Mr.N.Arun Prem Anand", "Materials Science and Technology - Ms.N.Sundari", "Process Instrumentation Dynamics and Control - Mr.S.Rajasekar", "Food Technology - Ms.G.Thayanidhi/Mr.S.Bharath","Air Pollution and Control - Ms.P.G.Priya Darshini","Heat Transfer Lab - Dr.R.Govindarasu/Ms.D.Durgadevi", "Process Equipment Design II - Ms.N.Sundari/Ms.S.Swathi","Mass Transfer Lab - Dr.D.Swaminathan/Dr.M.Yogesh Kumar", "Library - Mr.S.Bharath"};

    String[] flchemaeight = {"Petroleum Technology - Ms.A.C.Vijayalakshmi", "Process Plant Utilities - Ms.D.Durgadevi", "Project Practice -Aspen Plus Training - Mr.S.Jaiganesh/Mr.N.Arun Prem Anand/Dr.C.Anand Babu/Mr.B.S.Vishal", "Project Work - Dr.R.Palani/Mr.B.S.Vishal"};

    String[] flchembfour = {"Probability and Statistics - Dr.R.Umadevi", "Chemical Process Calculations - Ms.G.Thayanidhi", "Chemical Engineering Thermodynamics I - Ms.G.Sudha", "Mechanical Operations - Dr.N.Meyyappan", "Heat Transfer - Ms.N.Sundari", "Instrumental Methods of Analysis - Dr.S.Anand Babu", "Technical Analysis Lab - Dr.S.Anand Babu/Ms.G.Saraswathi", "Fluid Mechanics Lab - Mr.D.Sivakumar/Mr.S.Rajasekar","Library - Ms.P.G.Priyadarshini"};

    String[] flchembsix = {"Energy Engineering - Mr.D.Sivakumar", "Chemical Reaction Engineering I - Ms.G.Sarawathi", "Mass Transfer II - Dr.Nalinkanth V.Ghone", "Materials Science and Technology - Dr.M.Yogesh Kumar", "Process Instrumentation Dynamics and Control - Dr.R.Govindarasu", "Food Technology - Ms.G.Thayanidhi/Mr.S.Bharath","Air Pollution and Control - Ms.P.G.Priya Darshini","Heat Transfer Lab - Ms.A.C.Vijalakshmi/Mr.S.Bharath", "Process Equipment Design II - Ms.P.G.Priyadarshini/Ms.G.Thayanidhi","Mass Transfer Lab - Ms.G.Sudha/Ms.G.Saraswathi", "Library - Mr.S.Bharath"};

    String[] flchembeight = {"Petroleum Technology - Ms.P.G.Priyadarshini", "Process Plant Utilities - Dr.R.Palani", "Project Practice -Aspen Plus Training - Mr.N.Arun Prem Anand/Mr.S.Jaiganesh/Dr.C.Anand Babu/Mr.B.S.Vishal", "Project Work - Dr.R.Palani/Mr.B.S.Vishal"};

    String[] flcivilfour = {"Strength of Materials II - Dr.P.Venkateswara Rao/Mr.G.Kumar", "Applied Hydraulic Engineering - Mr.S.Diravia Balan/Mr.R.Kalaivannan", "Surveying II - Dr.M.Selvakumar", "Soil Mechanics - Ms.C.Sandhiya", "Environmental Science and Engineering - Mr.R.Kalaivannan", "Computational Methods - Ms.K.Vijayalakshmi", "Hydraulic Engineering Lab - Mr.S.Diravia Balan/Mr.R.Kalaivannan", "Survey Practical - Mr.K.Arun/Mr.G.Kumar", "Library - Mr.K.Arun/Mr.G.Kumar"};

    String[] flcivilsix = {"Concrete Technology - Dr.V.Tamizhselvi", "Construction Planning and Scheduling - Mr.K.Arun", "Design of Reinforced Concrete & Brick Masonry Structures - Mr.R.Kalaivannan", "Structural Analysis II - Dr.P.Venkateswara Rao/Ms.Ruby Freya", "Design of Steel Structures - Ms.Ruby Freya/Ms.K.Sathyapriya", "Railways, Airports and Harbour Engineering - Dr.M.Selvakumar", "Environmental Engineering II - Dr.E.Ravindranath", "Environmental Engineering Lab - Mr.R.Mathiyazhagan/Mr.G.Arun", "Concrete and Highway Engineering Lab - Dr.V. Tamizhselvi/Ms.K.Sathyapriya","Ms.C.Sandhiya"};

    String[] flcivileight = {"Prefabricated Structures - Mr.G.Kumar", "Repair and Rehabilitation of Structures - Mr.R.Mathiyazhagan", "Principles of Management - Mr.G.Arun"};

    String[] flcseafour={"Probability and Queuing Theory-Dr.B.Saravanan","Computer Networks-Ms.K.Bhuvana","Database Management Systems-Dr.R.Anitha","Deisgn and Analysis of Algorithms-Ms.T.Padmavathy","Computer Architecture-Ms.S.Rajalakshmi","Software Engineering-Mr.T.Rajasekaran","Networks Lab-Ms.J.Bhuvana and Ms.V.Rajalakshmi","Database Management Systems Lab-Ms.Iswarya & Ms.S.Poorani","Software Engineering Lab-Mr.T.Rajasekaran & P.Selvamani","Library-Dr.S.P.Manikandan"};

    String[] flcseasix = {"Distributed Systems-Mr.R.Senthil Kumar", "Mobile Computing-Dr.C.Jayakumar", "Compiler Design-Mr.C.S.Saroj", "Digital signal processing-Mr.M.Duraisamy",  "Artificial Intelligence-Dr.R.Jayabhaduri", "Total Quality Management-Dr.P.Janarthanan", "Mobile Application Dev Lab-Mr.K.Srinivasan & Mr.M.Suresh Kumar", "Compiler Lab-Mr.C>S>Saroj & Ms.S.Senthamizhselvi", "Communication and Soft Skill Lab-Mr.R.Premraj/Ms.Anichmalar"};

    String[] flcseaeight = {"Multi-Core Architecture and programming-Ms.N.Revathi", "Professional Ethics and Engineering-Dr.N>M>Balamurugan", "Knowledge Management-Dr.R.Nedunchelian", "Project work-Dr.R.Jayabhaduri"};

    String[] flcsebfour = {"Probability and Queuing Theory-Dr.M.Radhakrishnan", "Computer Networks-Mr.M.Adhimoolam", "Database Management Systems-Ms.S.Poorani", "Design of Analysis Of Algorithms-Ms.N.Rajeswai", "Computer Architecture-Ms.U.Abirami", "Software engineering-Mr.M.P.Lakshmana Kumar", "Networks Lab-Ms.J.Buvana/Mr.M.Adimoolam", "Database Management Systems Lab-Ms.S.Poorani,Ms.S.K.Umamaheswari,Ms.S.U.Muthunagai","Software Engineering Lab-Mr.M.P.Lakshmana Kumar & Mr.P.Selvamani","Libraray-Mr.R.Senthil Kumar"};

    String[] flcsebsix = {"Distributed Systems-Ms.N.Revathi", "Mobile Computing-Mr.B.Praveen Kumar", "Compiler Design-Ms.S.Senthamizhselvi", "Digital signal processing-Dr.V.Vidhya", "Artificial Intelligence-Ms.R.Gayathri", "Total Quality Management-Mr.M.P.Lakshmanakumar", "Mobile Application Dev Lab-Mr.B.Praveen Kumar.Mr.K.Kumanan,Ms.R.Gayathri(B2)", "Compiler Lab-,Ms.S.Senthamizhselvi,Mr.T.Kumaran,Ms.T.Padmavathy", "Communication and Soft Skill Lab-Dr.T.Ravindran,Dr.C.Amutha Charu Sheela"};

    String[] flcsebeight = {"Multi-Core Architecture and programming-Ms.D.Sasikala", "Professional Ethics and Engineering-dr.P.Janarthanan", "Knowledge Management-Ms.R.Gayathri", "Project work-Ms.R.Jayabhaduri"};

    String[] flcsecfour = {"Probability and Queuing Theory-Ms.N.S.Priya", "Computer Networks-Mr.K.Kumanan", "Database Management Systems-Ms.S.U.Muthunagai", "Design of Analysis Of Algorithms-Mr.P.Selvamani", "Computer Architecture-Ms.S.K.Umamaheshwari", "Software Engineering-Mr.S.Yuvaraj", "Networks Lab-Mr.K.Kumansn,Ms.V.Rajalakshmi(B2)", "Database Management Systems Lab-Ms.S.U.Muthunagai,Ms.S.K.Umamaheshwari,Ms.R.Iyswarya", "Software Engineering Lab-Mr.S.Yuvaraj & Mr.T.Rajasekaran", "Library-Dr.S.P.Manikandan"};

    String[] flcsecsix = {"Distributed Systems-Mr.R.SenthilKumar", "Mobile Computing-Mr.M.Suresh Kumar", "Compiler Design-Mr.T.Kumaran", "Digital signal processing-Mr.N.Kumaran", "Artificial Intelligence-Dr.R.Jayabhauri", "Total Quality Management-Mr.K.Srinivasan", "Mobile Application Dev Lab-Mr.K.Srinivasan,MrB.Praveen Kumar,Dr.N.M.Balamurugan(C1),Mr.R.Senthil Kumar(C2)", "Compiler Lab-Mr.T.Kumaran,Mr.C.S.Sanoj,Ms.T.Padmavathy", "Communication and Soft Skill Lab-Dr.C.Amutha Charu Sheela/Mr.R.Premraj"};

    String[] flcseceight = {"Multi-Core Architecture and programming-Ms.V.Rajalakshmi", "Professional Ethics and Engineering-Dr.S.P.Manikandan", "Knowledge Management-Ms.R.Iyswarya", "Project work-Dr.R.Jayabhaduri"};

    String[] fleceafour = {"Probability and Random Processes-Dr.V.valliammal", "Signals and Systems-Ms.M.Rekha ", "Analog Communication Systems-Ms.D.Menaka", "Electronoic Circuits-II-Mr.S.Saravanan", "Line Integrated Circuits-Ms.B.Sarala", "Control System Engineering-Ms.S,Kalyani", "Circuits and Simultation Integrated Lab-Ms.S.Sangeethapriya,Ms.M.Rekha/Mr.M.H.Masood,Ms.A.Bharathipriya", "Electrical Engineering and Control System Lab-Ms.K.Suganthi,(I/C),Mr.D.S.Purushothaman.,Mr.M.Ranjithkumar","Library-Mr.M.Duraisamy","Seminar-1.Mr.G.Loganathan,2.Ms.A.Bharathipriya"};

    String[] fleceasix = {"Principles Of Management-Ms.R.Kousalya", "Computer Architecture-Dr.S.Muthukumar", "Computer Networks-Ms.S.Reethi", "VLSI Design-Ms.M.Athappan", "Antenna and Wave Propagation-Mr.S.Senthil rajan", "Medical Electronics/Robotics Automation(E-I)-Mr.P.Muthukumaran/Mr.S.P.Sivagnana Subramanian", "Computer Networks Lab-Mr.B.Nethaji,Mr.P.Arul,Ms.S.Reethi", "VLSI Design Lab-Ms.M.Athappan/Ms.R.Kousalya,Mr.M.K.Varadarajan,Ms.M.Vidya", "Communication and Soft Skills Lab-Mr.Sam Dawson,Ms.Anichamalar", "Library-Ms.S.Reethi"};

    String[] fleceaeight = {"Wireless Communication-Ms.S.M.Mehzabeen", "Wireless Networks-Mr.R.Nagaraj", "Professional Ethics in Engineering-Dr.N.Kumaratharan", "Cryptography and Network Security/Toal Quality Management/Entrepreneurship Development(E-VI)-Ms.T.J.Jeyaprabha,Mr.M.H.Masood,Mr.S.Senthil Rajan", "Project Work-Ms.K.S.Subhashini",  "Library-Ms.K.Srividhya","Project-1.Mr.P.Venkatesh,2.Ms.A.Bharathipriya,3.Mr.M.Duraisamy,4.Mr.N.Sathish"};

    String[] flecebfour = {"Probability and Random Process-Dr.R.Umadevi", "Signals and Systems-Ms.R.Kousalya", "Analog Communication Systems-Dr.R.Gyathri", "Electronic Circuits-II-Mr.M.Athappan", "Linear Integrated Circuits-Ms.L.Anju", "Control System Engineering-Ms.Rajeswari Ramaraj", "Circuits and Simulation Integrated lab-Ms.C.Gomatheeswari Preethika,Mr.R.Nagaraj/Ms.Rajeswari Ramaraj,Dr.R.Gayathri/Dr.S.R.Malathi", "Electrical Engineering and Control System lab-Mr.S.Sudharsanam,(I/C),Mr.S.Thamizhmani,Ms.K.Suganthi","Library-M.L.Anju","Seminar-1.Ms.M.Vidya,2.Mr.S.R.Balasubramanian"};

    String[] flecebsix = {"Principles Of Management-Ms.T.J.Jeyaprabha", "Computer Architecture-Ms.S.Sangeethapriya", "Computer Networks-Ms.K.S.Subhashini", "VLSI Design-Ms.M.Anushya", "Antenna and Wave Propagation-Ms.K.Srividhya", "Medical Electronics/Robotics Automation(E-I)-Mr.P.Arul/Mr.S.P.Sivagnana Subramanian", "Computer Networks Lab-Mr.S.Senthil Rajan/Mr.S.P.Sivagnana Subramanian,Mr.M.Durisamy,Ms.S.Sangeethapriya", "VLSI Design Lab-Ms.M.Anushya,Mr.R.Nagaraj,Ms.Rajeswari Ramaraj/Ms.M.Rekha", "Communication and Soft Skills Lab-Dr.T.Murugavel,Mr.P.Ganapathy", "Library-Mr.N.Sathish"};

    String[] flecebeight = {"Wireless Communication-Ms.A.Bharathipriya", "Wireless Networks-Dr.G.A.Sathish Kumar", "Professional Ethics in Engineering(E-V)-Ms.S.Kalyani", "Toal Quality Management(E-VI)-Mr.S.Sivagana Subramanian", "Project Work-Ms.D.Menaka", "Project-1.Ms.S.Reethi,2.Ms.S.M.Mehzabeen,3.Mr.G.Loganathan,Mr.N.Kumaran", "Library-Ms.M.Anushya"};

    String[] flececfour = {"Probability and Random Process-Ms.N.S.Priya","Signals and Systems-Mr.G.Loganathan","Analog Communication Systems-Mr.M.K.Varadarajan" ,"Electronic Circuits II-Ms.B.Hemalatha", "Linear Integrated Circuits-Mr.S.R.Balasubramanian", "Control System Engineering-Mr.P.Venkatesh", "Circuits and Simulation Integrated lab-Mr.A.R.Balasubramanian,Mr.G.Loganthan/Ms.S.Reethi,Mr.P.Venkatesh","Electrical Engineering and Control System lab-Ms.S.Sinthamani,(I/C),Mr.S.Thamizhmani,Mr.S.Sudharsanam","Library-Mr.P.Venkatesh","Seminar-1.Mr.P.Arul,3.Mr.P.Venkatesh"};

    String[] flececsix = {"Principles Of Management-Ms.D.Menaka", "Computer Architecture-M.C.Gomatheeswari Preethika", "Computer Networks-Dr.G.Padmavathi", "VLSI Design-Dr.S.R.Malathi", "Antenna and Wave Propagation-Dr.P.Jothilakshmi", "Medical Electronics(E-I)-Ms.L.Anju", "Computer Networks Lab-Mr.S.Saravanan,Ms.C.Gomatheeswari Preethika,Mr.N.Kumaran", "VLSI Design Lab-Ms.L.Anju/Ms.S.Kalyani,Ms.S.M.Mehzabeen,Mr.P.Venkatesh", "Communication and Soft Skills Lab-Mr.Sam Dawson,Mr.P.Ganapathy", "Library-Ms.S.Sangeethapriya"};

    String[] flececeight = {"Wireless Communication-Ms.K.Srividhya", "Wireless Networks-Ms.K.S.Subhashini", "Professional Ethics in Engineering(E-V)-Dr.H.Umma Habiba", "Cryptography and Network Securith/Toal Quality Management/Entrepreneurship Development(E-VI)-Ms.T.J.Jeyaprabha,Mr.M.H.Masood,Mr.S.Senthi Rajan", "Project Work-Ms.A.BharathiPriya", "Project-Ms.Rajeswari Ramaraj,Ms.S.Sangeethapriya,Mr.M.K.Varadarajan,Mr.N.Sathish", "Library-Mr.N.Kumaran"};

    String[] fleeeafour = {"Computational Methods-Dr.B.Saravanan", "Electric Power Systems-Mr.M.Rajvikram", "Electrical Machines-II-Mr.V.Mohanraj", "Digital Logic Circuits-Mr.G.Vinothkumar", "Analog Circuits-Dr.Sudhakar Bharatan", "Control Systems-Ms.D.Amudha Valli", "Electrical machines-II laboratory - Mr V Mohanraj,Mr.I.Venkatraman,Mr.M.Ranjithkumar", "Digital and Analog Circuits Lab-Mr.G.Vinothkumar,Ms.S.Arulmozhi", "Control Systems and Instrumentation Lab-Dr.S.G.Bharathidasan,Mr.C.Venkatesan,Mr.S.v.Sreeraj"};

    String[] fleeeasix = {"Communication Engineering - Ms.S.Anitha", "Solid state Drives-Ms.M.Sasikala", "Embedded systems-Ms K Pavithra", "Power system operation and control-Mr. R.Kannadasan", "Design of electrical machines-Dr.N.K.Mohanty", "Advanced Control System(E-I)-Dr.S.G.Bharathidasan", "Power electronics and drivers laboratory-Ms.M.Sasikala,Ms.N.Shanmugavadivu", "Microprocessor and microcontroller - Ms.S.Anitha,Ms.K.S.Pavithra", "Presentation skills and technical seminar - Ms.M.Madhuri,Mr.G.Vinothkumar,Mr.R.Kannadasan", "Central library-Mr.V.Mohanraj"};

    String[] fleeeaeight = {"Electric Energy Generation,Utilization and conservation- Mr.D.S.Purushothaman", "power Electronics for renewable energy Systems(E-IV)- Mr.S.Kumaravel ", "professional Ethics oin Engineering(E-V) - Dr.R.Karthikeyan", "Project work -Dr.S.G.Barathidasan", "Central library - Mr.C.Kamal", "Seminar - T.Annamalai"};

    String[] fleeebfour = {"Computatioanl methods- Dr.M.Radhakrishnan", "Electric Power System-Ms.M.Maadhuri", "Electrical Machines-II-Mr.I.Venkatrama", "Digital Logic Circuits=-Ms.S.Arulmozhi", "Analog Circuits-Dr.K.R.Santha", "Control Systems-Mr.C.Venktesan", "Electrical MSchines Laboratory-II - Mr.I.Venkatraman,Mr.V.Mohanraj,Mr.M.Shankar", "Digitl and analog Circuits Lab-Ms.S.Arulmozhi,Mr.G.Vinothkumar", "Control Systems And Insr=trumentayion Lab-Mr.C.Venkatesan,Dr.S.G.Bharathidasan,Mr.S.Kumaravel"};

    String[] fleeebsix = {"communication Engineering - Dr.R.Karthikeyan", "Solid state drives - Ms.N.Shanmugavadivu", "Embeded Systems - Ms.K.S.Pavithra", "Power System operation and control - Mr.M.Sankar", "Design of electrical machines - Dr.C.Gopinath", "Advanced ControlSystems(E-I)-Dr.S.G.Bharathidasan","optimisation techniques - Mr S Thanmizmani", "power electronics and drives laboratory - Ms.N.Shanmugavadivu,Ms.M.Sasikala", "Microprocessor and micro controller laboratory - Mr.M.Shankar,Ms.S.Anitha", "Presentation skills and technical seminar - Mr.S.Thamizhmani,Mr.G.Vinothkumar,Mr.R.Kannadasan", "Central library - Ms.K.Suganthi"};

    String[] fleeebeight = {"Electric enery generation Utilization and conservation - Mr S sethuraman", "Power Electronics for renewable ENergy systems - Mr C Venkatesan", "Project Work - Mr. T Annamalai", "Central library - Mr C VEnkatesan", "Seminar - Mr A Deepak"};

    String[] flitafour = {"Probability and queuing theory - Dr B.Thilaka", "Microprocessor and microcontroller - Mr.K.Suresh", "Paradigms of Algorithm Design-Mr.E.Sivakumar", "Databse Management System-Ms.Kiruba Wesley", "Software engineering Methodologies - Mr.E.Sakthivel", "IT Essentials-Ms.P.Nirmala","Microprocessor and microcontroller laboratory - Mr.T.Sukumar,Mr.K.Suresh,Mr.E.Sivakumar", "Database Management Systems Lab -Ms.K.Nivetha Shree,Ms.Kiruba Wesleey,Ms.R.Saktheeshwari/Ms.G.Sangeetha", "Mini Project-Ms.B.T.Shobaa,Mr.T.Sukumar,Ms.G.Sangeetha", "Library -  Ms.A.Kala"};

    String[] flitasix = {"Distributed Systems - Ms.M.Sugacini", "Mobile Computing - Ms.S Jerusha", "Artificial intelligence - Ms N Uma", "Compiler Design - Ms.S.Kalavathi", "Software architecture - MS J Sharon ranjitha Ester ", "TOtal Quality Management - Ms.K.Kiruthika Devi", "Mobile appication development laboratory - Ms.D.Jayanthi,Ms.S.Jerusha,Ms.M.Sugacini", "Compiler Laboratory -Ms.S.Kalavathi,Ms.P.Nirmala,Ms.A.Rohini/Ms.P.Sharon Femi", "Communication and softskills laboratory - Mr.Sakthivel/Ms.S.B.Lavanya", "Library -Mr.A.R.Guru Gokul"};

    String[] flitaeight = {"Service oriented Architecture - Ms.A.Kala ", "Professoional ethics - Ms.B.T.Shobana", "Cyber Forensics -Mr.T.Sukumar", "Software project management - Dr.G.Sumathi", "Project Work - Ms.B.T.Shobana", "Library -Ms.P.Nirmala "};

    String[] flitbfour = {"Probability and queuing theory - Ms N.S Priya", "Microprocessor and microcontroller -Dr.C.Yaashuwanth", "Paradigms of Algorithm-Ms.N.Devi", "Database Management systems - Ms A.Indumathi", "Software engineering Methodologies-Mr S Uvaraj Arutkumaran", "Microprocessor and microcontroller laboratory - Dr.C.Yaahuwnth,Mr.K.Suresh,Ms.V.Saroja/Ms.V.M.Megala", "Database Management Systems Lab-Ms.R.Satheeswari,Mr.E.Sivakumar,Ms.A.Indumathi/Ms.P.Leela Rani", "Mini Project-Ms.D.Jayatnthi,Ms.R.Satheeswari", "Library -  Ms.N.Uma"};

    String[] flitbsix = {"Distributed Systems - Ms G Sangeetha", "Mobile Computing - Ms.V.Saroja", "Artificial Intelligence - Ms P sharon Femi", "Compiler Design -Dr.V.Vidhya", "Software archetecture - MS C Silambarasi", "TOtal Quality Management - Ms.V.M.Megala", "Mobile appication development laboratory - MS Kiruba Wesley , Ms C Silambarasi , Ms G Sangeetha", "Compiler LAboratory - Ms.V.Saroja,Ms.M.Sugacini,Ms.N.Devi/Ms.G.Sangeetha","Compiler lab-Ms.B.T.Shobana,Ms.P.Sharon Femi,Ms.P.Nirmala/Ms.S.Kalavathi ","Communication and softskills laboratory - Mr.P.Ganapathy,Dr.T.Murugavl", "Library - Ms.G.Sangeetha"};

    String[] flitbeight = {"Service oriented Archetecture - Ms.D.Jayanthi", "Professoional ethics-Ms.V.M.Sivagami", "Cyber Forensics-Mr AR gurugokul ", "Software project management - Ms P leela Rani", "Project Work -Dr.C.Yaashuwanth,Ms.S.Klavathi", "Library - Ms.P.Sharon Femi "};

    String[] flmechafour = {"Computational Methods-Ms.K.Vijayalakshmi", "Kinematics Of Machinery-Dr.N.Muthukrishnan/Mr.K.RamPrasad(Tut)", "Manufacturing Technology II-Mr.M.Kalaimani", "Thermla Engineering-Mr.R.Kaliyanasunder/Mr.G.Suresh(T)","Fluid Mechanics and Machinery-Mr.G.Logachander/Mr.M.Gajendiran(T)", "Environmental Science and Engineering-Mr.S.Barath", "Thermal Engineering Lab-I-Dr.P.Raghu/Mr.M.Balakumar(Fri)/Mr.G.Logachander/Mr.G.Suresh(Tue)", "Manufacturing Technology laboratory II-Dr.S.Ponnuvel/Mr.S.Yeshwat Raj/Mr.K.RamPrasad", "Fluid Mechanics and Machinery Lab-Mr.V.Sridharan/Mr.M.Balakumar(Fri),Mr.K.Karthee(Wed)"};

    String[] flmechasix = {"Design Of Transmissionsystems-Mr.S.Muniraj/Mr.J.Sivaramapandian(T)", "Principles of Management-Dr.S.Ponnuvel", "Automobile Engineering-Mr.A.Kumarasamy", "Finite Element Analysis-Mr.E.Suresh(T)/Mr.C.Senthamaraikannan", "Gas Dynamics and Jet Propulsion-Mr.S.Arumugan(T)/Mr.P.Raghu", "Renewable Sources of Energy-Mr.V.Sridharan", "Unconventional Machining Process-Mr.R.Ramesh", "C.A.D./C.A.M.Laboratory-Mr.M.Maheswaran/Dr.C.Senthamaraikannan.Mr.G.Saravanan/Mr.M.Nishal", "Design and Fabriction project-Dr.S.Gopinath/Mr.V.Senthil Velan", "Communication Skills Lab-Mr.T.Ravindran/Mr.Sam Dawson"};

    String[] flmechaeight = {"Engineering Economics-Mr.S.Yeshwanth/Dr.S.RameshBabu", "Entrepreneurship Development-Mr.V.Senthilvelan", "Operations Research-Mr.M.Maheswaran", "Advanced I.C.Engines-Dr.S.Saravanan", "Additive Manufacturing-Dr.K.S.Badrinathan", "Non Destructive Testing and Materials-Dr.M.Ananthkumar","Project Work-Dr.K.S.Badrinath/Dr.S.Ponnuvel/Mr.S.Arumugam/Mr.M.Kalaimani"};

    String[] flmechbfour = {"Computational Methods-Dr.R.Muthucumaraswamy", "Kinematics Of Machinery-Mr.K.RamPrasad/Dr.N.Muthukrishnan(T)", "Manufacturing Technology II-Dr.S.Illiyavel/Dr.S.Ramesh Babu", "Thermal Engineering-Mr.G.Suresh/Dr.S.Natarajan(T)", "Environmental Science and Engineering-Mr.S.Stanley", "Thermal Engineering-Mr.R.Kaliyanasunder,Dr.S.Saravanan(Tut)", "Manufacturing Technology laboratory II-Mr.S.Ponnuvel/Mr.K.Ramprasad", "Thermal Engineering Laboratory I-Mr.M.Gajendiran(1)/Mr.G.Logachandar", "Strength Of Materials laboratory I-Mr.V.Sridharan(1)/Mr.G.Loganchar/Mr.S.Yeswanthraj", "Seminar/Lab-Mr.M.Gajendiran"};

    String[] flmechbsix = {"Design Of Transmissionsystems-Mr.J.Sivarampandian/Mr.S.Muniraj(T)", "Principles of Management-Mr.M.Nishal", "Automobile Engineering-Mr.Dr.T.Raja", "Finite Element Analysis-Mr.C.Senthamaraikannan(T)/Mr.E.Suresh", "Gas Dynamics and Jet Propulsion-Mr.P.Raghu(T)/Mr.S.Arumugam", "Renewable Sources of Energy-Mr.V.Sridharan", "Unconventional Machining Processes-Dr.M.Mohandass", "C.A.D./C.A.M.Laboratory-Mr.G.Saravanaram/Mr.M.Maheswaran/Mr.M.Nishal/Dr.C.Senthamaraikannan", "Design and Fabriction projectDr.S.Illiyavel/Mr.S.Muniraj", "Communication Skills Lab-Mr.T.Ravindran/Mr.R.Premraj"};

    String[] flmechbeight = {"Engineering Economics-Mr.K.Karthee/Dr.S.Rameshbabu", "Entrepreneurship Development-Mr.S.Gopinath", "Operations Research-Mr.M.Maheswaran", "Advanced I.C.Engines-Dr.S.Saravanan", "Additive Manufacturing-Dr.K.S.Badrinath" , "Non Destructive Testing and Materials-Dr.M.Ananthkumar" , "Project Work-Dr.K.S.Badrinath/Dr.S.Ponnuvel/Mr.S.Arumugam/Mr.M.Kalaimani"};

    String[] flmarinetwo={"Computational Methods - Dr.A.R.Vijayalakshmi", "Mechanics of Solids - Mr.G.Rameshkannan/Mr.Karnam Dileep", "Marine Diesel Engines I - Prof.T.R.Mohan", "Marine Auxilliary Machinery I - Prof.K.V.Sivanarayana", "Marine Refrigeration and Air Conditioning - Dr.M.Anandan", "Engineering Materials, Metallurgy and Metrology - Mr.J.Arun Chakkaravarthy/Mr.S.G.Karthik", "Marine Boilers and Steam Turbines - Prof.T.R.Mohan", "Strength of Materials and Applied Mechanics Lab - Mr.G.Rameshkannan/Mr.S.G.Karthik", "Thermal Engineering and Boiler Chemistry Lab - Mr.Karnam Dileep/Dr.S.Stanley Samuel"};

    String[] flmarinefour={""};

    String[] flmarinesix={""};

    String[] flmarineeight = {"Environmental Science and Engineering - Dr.S.Stanly Samuel", "Ship Operational Management and IMO Requirements - Prof.K.V.Sivanarayana", "Marine Control Engineering and Automation - Prof.T.R.Mohan", "Safety Precautions and Watch Keeping - Prof.S.Krishnan", "Marine Corrosion and Prevention - Mr.R.Somasundaram", "Project Work, Technical Paper and Viva voce - Mr.V.Gurusamy/Mr.B.Srivathsan", "Comprehension Test - Mr.R.Somasundaram/Mr.B.Srivathsan"};

    //odd sem of second year and third year and fourth year


    String[] flautothree = {"Automotive Engines-Dr.J.Venkatesan", "Mathematics III-Ms.N.S.Priya", "Engineering Thermodynamics-Mr.A.Balasubramanian / Mr.A.K.Boobalasenthilraj", "Engineering Materials and Metallurgy-Mr.K.E.Kumaraguru", "Mechanics of solids-Dr.S.Premnath / Mr.Ramanjaneyulu Kolla", "Manufacturing Technology-Mr.J.Dhanabal ", "Engine Performance and System Testing Lab-Dr.V.Ganesh / Mr.A.Balasubramanian", "Strength of materials lab-Mr.S.Premanth / Mr.R.Sakthivel / Mr.Ramanjaneyulu Kolla","Manufacturing Technology Lab-Mr.J.Dhanabal / Mt.K.E.Kumaraguru"};

    String[] flautofive = {"Applied Thermodynamics and Heat Transfer - Mr.K.Paul Durai / Mr.A.Balasubramanian", "Automotive Transmission-Mr.Ramanjaneyulu Kolla", "Automotive Electrical and Electronics System-Mr.G.Ravi", "Vehicle Design and Data Characteristics-Mr.R.Sakthivel / Mr.G.Ravi", "Automotive Fuels and Lubricants-Mr.E.Ravindar Rao", "Design of Machine Elements-Mr.J.Dhanabal / Mr.K.E.Kumaraguru", "Automotive Electrical and Electronics Lab-Mr.P.Muthukumaran / Mr.R.Nagaraj / Mr.A.Balasubramanian / Mr.A.K.Boobalasenthilraj", "Automotive Fuels and Lubricants Lab-Mr.Ramanjaneyulu Kolla / Mr.R.Sakthivel","Computer Aided Machine Drawing Lab-Mr.K.Paul Durai / Mr.G.Ravi"};

    String[] flautoseven = {"New Generation and Hybrid Vehicles-Mr.K.E.Kumaraguru","Automotive Aerodynamics-Mr.J.Dhanabal","Automotive Safety-Mr.G.Ravi","Engine and Vehicle Management System-Mr.R.Sakthivel","Vehicle Maintenance-Mr.K.Paul Durai","Automotive Pollution and Control-Mr.A.K.Boobalasenthilraj","Finite Element Analysis-Dr.V.Ganesh / Mr.Ramanjaneyulu Kolla","Engine Performance and Emission Testing Lab-Mr.V.Gamesh / Mr.A.K.Boobalasenthilraj","Vehicle Maintenance Lab-Dr.S.Premnath / Mr.E.Ravindar Rao","Library-Mr.A.K.Boobalasenthilraj","Placement-Mr.G.Ravi / Mr.Ramanjaneyulu Kolla","Project Work I-Mr.E.Ravindar Rao"};

    String[] flbiotechthree = {"Transforms and Partial Differential Equations-Dr.R.Muthukumarasamy","Stoichiometry and Process Calculations-Ms.V.Sumitha / Mr.P.K.Praveen Kumar (T)","Bioorganic Chemistry-Mr.N.Sathish / Dr.S.Prabhu (T)","Cell Biology-Mr.S.Naga Vignesh / Ms.P.Jaibiba (T)","Basic Industrial Biology-Ms.N.Kanagam","Environmental Science and Engineering-Prof. R.B.Narayanan","Cell Biology Lab-Ms.P.Jaibiba / Mr.S.Naga Vignesh","Bioorganic Chemistry Lab-Ms.S.Pandi Prabha / Dr.A.Senthil Nagappan","Library-Ms.V.Sumitha","Seminar-Mr.P.K.Praveen Kumar"};

    String[] flbiotechfive = {"Protein Structure Function and Proteomics-Mr.S.Naga Vignesh / Dr.A.Senthil Nagappan(T)","Bioprocess Engineering-Dr.D.Suresh Kumar / Dr.D.Nilavunesan (T)","Mass Transfer Operations - Dr.D.Nilavunesan / Ms.V.Sumitha(T)","Molecular Biology-Mr.N.Sathish ","Biophysics-Dr.Senthil Nagappan","Principles of Food Processing-Ms.P.Jaibiba","Biopharmaceutical Technology-Dr.S.Pandi Prabha","Bioprocess Lab-I-Dr.D.Nilavunesan / Mr.D.Suresh Kumar","Molecular Biology Lab-Mr.N.Sathish / Ms.N.Kanagam","Library-Mr.J.Hariharan","Seminar-I-Dr.S.Prabhu ","Seminar-II-Dr.R.B.Narayanan"};

    String[] flbiotechseven = {"Bioinformatics and Computational Biology-Mr.P.K.Praveen Kumar / Mr.S.Naga Vignesh (T)","Downstream Processing-Dr.E.Nakkeeran / Mr.D.Suresh Kumar (T)","Creativity,Innovation and New Product Development-Dr.A.Senthil Nagappan","Bioconjugate Technology and Applications-Mr.J.Hariharan","Bio Industrial Entrepreneurship-Ms.N.Kanagam","Tissue Engineering-Dr.R.B.Narayanan","Neurobiology and Cognitive Sciences-Dr.S.Prabhu","Downstream Processing Lab-Mr.D.Suresh Kumar / Dr.D.Nilavunesan","Immunology Lab-Ms.N.Kanagam /Mr.J.Hariharan","Bioinformatics lab-Mr.P.K.Praveen Kumar / N.Sathish","Library-N.Sathish","Seminar-Ms.V.Sumitha","Project Planning-Dr.E.Nakkeeran"};

    String[] flchemathree = {"Mathematics III-Dr.V.Thilaka","Electrical Drives And Control-Dr.V.Sreeraj","Organic Chemistry-DrM.Thirumalaikumar","Mechanics of Solids for Chemical Engineering-Mr.S.Jai Ganesh / Dr.M.Yogesh Kumar(T) ","Physical Chemistry-Dr.N.Nachiappan","Fluid Mechanics-Mr.D.Sivakumar / Mr.N.Meyyappan(T)","Organic Chemistry Lab-Dr.G.Thirumalaikumar / Ms.G.Sudha","Physical Chemistry Lab-Dr.N.Nachiappan / Dr.Nalinkanth V Ghone(A1) / Ms.N.Sundari(A2)", "Library-Ms.N.Sundari"};

    String[] flchemafive = {"Computational Methods-Ms.A.Suba","Environmental Science and Engineering-Ms.S.Swathi","Chemical Process Industries I-Ms.N.Sundari", "Chemical Engineering Thermodynamics II-Ms.G.Thayanidhi","Mass Transfer I-Dr.Nalinkanth V Ghone","Process Instrumentation Dynamics and Control-Dr.R.Govindarasu","Interview and Career Skills Lab-Dr.T.Murugavel / Mr.P.Ganapathy","Mechanical Operations Lab-Mr.N.Arun Prem Anand / Ms.G.Thayanidhi", "Heat Transfer Lab-Mr.B.S.Vishal/Ms.N.Sundari"};

    String[] flchemaseven = {"Drugs and Pharmaceutical Technology-Dr.Nalinkanth V Ghone","Fertilizer Technology-Ms.G.Sudha","Industrial Management-Mr.B.S.Vishal","Chemical Reaction Engineering-Ms.A.C.Vijayalakshmi / Mr.S.Bharath","Transport Phenomena-Dr.C.Anand Babu","Chemical Process Plant Safety-Dr.N.Meyyappan","Process Economics-Mr.B.S.Vishal","Biochemical Engineering-Dr.D.Swaminathan","Chemical Reaction Engineering Lab-Dr.R.Palani / Ms.G.Sudha","Process Control Lab-Dr.R.Govindarasu / Mr.S.Jai Ganesh"};

    String[] flchembthree = {"Mathematics III-Ms.Visalakshi Subramanian","Electrical Drives And Control-Dr.V.Sreeraj","Organic Chemistry-Dr.G.Baskar","Mechanics of Solids for Chemical Engineering-Dr.M.Yogesh Kumar / Mr.S.Bharath","Physical Chemistry-Dr.M.Thirumalaikumar","Fluid Mechanics-Dr.R.Palani / Mr.B.S.Vishal","Organic Chemistry Lab-Dr.G.Baskar / Mrs.G.Saraswathi","Physical Chemistry Lab-Ms.B.Preetha / Mr.D.Sivakumar","Library-Ms.G.Saraswathi"};

    String[] flchembfive = {"Computational Methods-Dr.B.Saravanan","Environment Science and Engineering-Ms.G.Saraswathi","Chemical Process Industries I-Mr.S.Rajasekar","Chemical Engineering Thermodynamics II-Ms.S.Swathi","Mass Transfer I-Ms.N.Sundari","Process Instrumentation Dynamics and Control-Mr.N.Arun Prem Anand","Interview and Career Skills Lab-Dr.S.B.Lavanya / Mr.R.Premraj","Mechanical Operations Lab-Dr.D.Swaminathan / Dr.M.Yogesh Kumar","Heat Transfer Lab-Ms.A.C.Vijayalakshmi / Ms.S.Swathi"};

    String[] flchembseven = {"Drugs and Pharmaceutical Technology-Dr.Nalinkanth V Ghone","Fertilizer Technology-Ms.G.Sudha","Industrial Management-Mr.B.S.Vishal","Chemical Reaction Engineering-Mr.S.Bharath / Dr.C.Anand Babu","Transport Phenomena-Mr.N.Arun Prem Anand","Chemical Process Plant Safety-Ms.G.Thayanidhi","Process Economics-Ms.P.G.Priyadarshini","Biochemical Engineering-Dr.M.Yogesh Kumar","Chemical Reaction Engineering Lab-Mr.D.Sivakumar / Mr.S.Bharath","Seminar and Comprehension- B1-Dr.C.Anad Babu / Mr.S.Rajasekar / Dr.R.Govindarasu.  B2-Ms.P.G.Priyadarshini / Dr.Nalinkanth V Ghone","Process Control Lab-Mr.S.Rajasekar / Ms.P.G.Priyadarshini"};

    String[] flcivilthree = {"Strength of Materials I-Dr.P.Venkateswara Rao / Mr.G.Kumar","Mechanics of Fluids-Mr.S.Diravia Balan / Mr.R.Kalaivannan","Surveying I-Mr.G.Kumar","Engineering Geology-Mr.K.Arun","Construction Materials-Ms.K.Sathya Priya","Mathematics III-Dr.S.Prabhu","Strength of Materials Lab-Mr.R.Mathiyazhagan / Dr.P.Venkateswara Rao / Ms.Ruby Freya","Computer Aided Building Drawing-Ms.K.SathyaPriya / Mr.G.Arun / Mr.S.Diravia Balan","Library-Mr.K.Arun","Seminar-Mr.S.Diravia Balan"};

    String[] flcivilfive = {"Structural Analysis I-Ms.Ruby Freya / Ms.K.Sathya Priya","Highway Engineering-Dr.M.Selvakumar","Design of Reinforced Concrete Elements-Ms.K.Sathya Priya","Foundation Engineering-Ms.C.Sandhya","Environmantal Engineering I-Mr.R.Mathiyazhagan","Construction Techniques and Equipment Practice-Mr.K.Arun","Soil Mechanics Lab-Ms.C.Sandhya / Mr.G.Arun","Interview and Career Skills Lab-Ms.B.Anichamalar","Seminar-Ms.Ruby Freya","Library-Ms.K.Sathya Priya"};

    String[] flcivilseven = {"Traffic Engineering and Management-Dr.M.Selvakumar","Structural Dynamics and Earthquake Engineering-Mr.G.Kumar","Prestressed Concrete Structures-Dr.V.Tamizhselvi","Water Resources and Irrigation Engineering-Mr.R.Kalaivannan","Estimation and Quantity Surveying-Mr.G.Arun","Municipal Solid Waste Management-Mr.R.Mathiyazhagan","Computer Aided Design and Drafting Lab-Mr.G.Kumar/Mr.R.Kalaivannan","Design Project-All Faculties","Technical Skills-Ms.Ruby Freya","Quantitative and Aptitude-Dr.M.Selvakumar","Library-Mr.R.Mathiyazhagan"};

    String[] flcseathree = {"Mathematics III-Dr.R.Uma Devi","Programming and Data Structures II-Ms.T.Padmavathy","Operating Systems-Ms.D.Sasikala","Microprocessor and Microcontroller-Mr.A.Sowmyanarayanan","Analog and Digital Communication-Ms.D.Menaka","Environmantal Science and Engineering-Dr.A.Senthil Nagappan","Programming and Data Structures Lab II-Ms.T.Padmavathy / Ms.V.Rajalakshmi","Operating Systems Lab-Ms.D.Sasikala / Ms.U.Abirami","Microprocessor and Microcontroller Lab-Ms.MMehzabeen(A1) / Ms.C.Gomatheeswari Preethika(A2) / Mr.N.Kumaran","Library-Mr.R.Senthilkumar"};

    String[] flcseafive = {"Discrete Mathematics-Dr.B.Thilaka","Internet Programming-MS.J.Buvana","Object Oriented Analysis and Design-Mr.R.Senthilkumar","Theory of Computation-Mr.P.Selvamani","Computer Graphics-Dr.N.M.Balamurugan","Internet Programming Lab-Ms.J.Buvana / Mr.K.Srinivasan","Computer Graphics Lab-Ms.G.Janakasudha & Mr.M.P.Lakshmanakumar / Dr.N.M.Balamurugan & Dr.R.Jayabhaduri","Seminar 1-Dr.P.Janarthanan","Seminar 2-Dr.N.M.Balamurugan","Library-Dr.K.S.Gayathri"};

    String[] flcseaseven={"Cryptogtaphy and Network Security-Mr.K.Kumaran","Graph Theory and Applications-Ms.S.Rajalakshmi","Grid and Cloud Computing-Ms.S.Iyswarya","Resource Managament Techniques-Ms.N.Revathi","Cyber Forensics-Mr.T.Kumaran","Information Retrieval-Dr.R.Jayabhaduri","Security Lab-Mr.K.Kumaram & Mr.C.S.Sanoj","Grid and cloud Computing Lab-Ms.R.Iyswarya & Ms.R.Gayathri","Project 1-Ms.N,Rajeswari & Mr.P.Selvamani","Project 2-Dr.P.Janarthanan & Dr.J.M.Gnanasekar","Project 3-Dr.C.Jayakumar & Mr.M.Suresh Kumar","Seminar -Mr.T.Rajasekaran","Library-Ms.N.Rajeswari"};

    String[] flcsebthree = {"Mathematics III-Dr.S.Prabhu","Programming and Data Structure Lab II-Ms.V.Rajalakshmi","Operating Syatems-Ms.S.Senthamizhselvi","Microprocessor and Microcontroller-Mr.A.Sowmyanarayanan","Analog and Digital Communication-Ms.K.S.Subhashini","Environmental Science and Engineering-Dr.A.Nilavunesan","Programming and Data Structures Lab II-Ms.V.Rajalakshmi & Ms.S.Rajalakshmi","Operating Systems Lab-Ms.S.Senthamizhselvi & Ms.D.Sasikala","Microprocessor and Microcontroller Lab-Ms.S.M.Mehzabeen & Mr.G.Loganathan","Library-Ms.R.Bhuvaneswari"};

    String[] flcsebfive = {"Discrete Mathematics-Dr.G.Satheeshkumar","Internet Programming-Dr.J.M.Gunasekar","Object Oriented Analysis and Design-Mr.R.Senthilkumar","Theory of Computation-Ms.R.Gayathri","Computer Graphics-Ms.E.Rajalakshmi","Internet Programming Lab-Ms.N.Revathi & Ms.J.Buvana","Computer Graphics Lab-Ms.E.Rajalakshmi & Mr.M.P.Lakshmanakumar","Interview and Career Skills Lab-Mr.Sam Dawson & Ms.Amutha Charu Sheela","Seminar 1-Dr.R.Jayabhaduri","Seminar 2-Ms.N.Rajeswari / Mr.M.Suresh Kumar","Library-Dr.R.Jayabhaduri"};

    String[] flcsebseven = {"Cryptogtaphy and Network Security-Mr.M.Adimoolam","Graph Theory and Applications-Mr.T.Rajasekaran","Grid and Cloud Computing-Dr.P.Janarthanan","Resource Management Techniques-Dr.R.Nedunchelian","Cyber Forensics-Mr.T.Kumaran","Information Retrieval-Dr.R.Jayabhaduri","Security Lab-Mr.M.Adimoolam & Mr.A.Sowmyanarayanan","Grid and Cloud Computing Lab-Ms.R.Gayathri & Ms.P.Vinothiyalakshmi","Seminar-Ms.N.Rajeswari","Project 1-Dr.C.Jayakumar & Mr.A.Sowmyanarayanan","Project 2-Mr.R.Senthilkumar & Dr.S.P.Manikandan","Project 3-Dr.R.Jayabhaduri & Mr.M.Adimoolam","Library-Dr.C.Jayakumar"};

    String[] flcsecthree = {"Mathematics III-Ms.N.S.Priya","Programming and Data Structures II-Ms.N.Rajeswari","Operating Systems-Dr.R.Anitha","Microprocessor and Microcontroller-Mr.B.Praveenkumar","Analog and Digital Communication-Mr.B.Nethaji","Environmental Science and Engineering-Mr.S.Bharath","Programming and Data Structures Lab II-N.Rajeswari,Ms.T.PAdmavathy & Mr.B.Praveenkumar","Operating Systes Lab-Ms.U.Abirami & Ms.S.Senthamizhselvi","Microprocessor and Microcontroller Lab-Mr.B.Nthaji, Ms.RajeswariRamaraj","Library-Ms.N.Rajeswari"};

    String[] flcsecfive = {"Discrete Mathematics-Dr.A.R.Vijayalakshmi","Internet Programming-Mr.K.Srinivasan","Object Oriented Analysis and Design-Mr.M.P.Lakshmanakumar","Theory of Computation-Mr.C.S.Saroj","Computer Graphics-Dr.N.M.Balamurugan","Internet Programming(Tutorial)-Mr.K.Srinivasan & Dr.J.M.Gnanasekar","Computer Graphics Lab-Ms.G.Janakasudha,Mr.M.P.Lakshmanakumar(C1), Ms.E.Rajalakshmi(C2)","Internet Programming Lab-Mr.K.Srinivasan,Ms.N.Revathi","Interview and Career skills laboratory-Ms.S.B.Lavanya and Mr.S.Sakthivel","Seminar 1-Dr.S.P.Manikandan and Mr.T.Kumaran","Seminar 2-Mr.T.Kumaran","Library-Dr.P.Janarthanan"};

    String[] flcsecseven = {"Cryptography and Network Security-Mr.M.Suresh Kumar","Graph Theory and Applicatons-Ms.U.Abirami","Grid and cloud Computing-Ms.P.Vinothiyalakshmi","Resource Management Techniques-Mr.P.Selvamani","Ad hoc and sensor Networks-Dr.C.Jayakumar","Data Analytics-Dr.S.P.Manikandan","Security Lab-Mr.K.Kumanan & Mr.M.Sureshkumar","Grid and Cloud Computing Lab-Ms.R.Ishwarya & Ms.P.Vinothiyalakshmi","Seminar 1-Dr.K.S.Gayathri","Project1-Mr.A.Sowmyanarayanan and Mr.M.Adimoolam","Project 2-Mr.M.Sureshkumar & Mr.Rajasekaran","Project 3-Dr.S.P.Manikandan & Mr.P.Selvamani","Library-Dr.S.P.Manikandan"};

    String[] fleceathree = {"Mathematics III-Dr.A.R.Vijayalakshmi","Electrical Engineering and Instrumentation-Ms.M.Rajalakshmi","Programming and Data Structures-Ms.S.U.Muthunagai","Digital Electronics-Mr.M.K.Varadarajan","Electromagnetic Fields-Ms.Rajeswari Ramaraj/Dr.P.Jothilakshmi(T)","Electronic Circuits I-Mr.S.R.Balasubramanian","Digital Electronics Lab-Ms.M.Anushya,Mr.M.K.Varadarajan,Ms.Rajeswari Ramaraj","Analog Circuits Lab-Dr.R.Gayathri,Mr.B.Nethaji,Ms.S.Reethi","Programming and Data Structures Lab-Ms.S.U.Muthunagai,Ms.S.K.Umamaheswari","Library-Dr.P.Jothilakshmi"};

    String[] fleceafive = {"Digital Communication-Dr.S.R.Malathi","Principles of Digital Signal Processing-Ms.R.Kousalya,Dr.N.Kumaratharan(T))","Transmission Lines and waveguides-Mr.P.Muthukumaran, Mr.K.Srividhya(T)","Microprocessor and Microcontroller-Ms.K.S.Subhashini","Environmental Science and Engineering-Ms.C.Sandhiya","Digital Signal Processing Lab-Ms.R.Kousalya,Ms.B.Sarala,Mr.N.Sathish/Mr.P.Arul","Communication System Lab-Ms.M.Anushya,Ms.B.Hemalatha/Mr.M.H.Masood,Dr.H.Umma Habiba/DR.P.Jothilakshmi","Microprocessor and Microcontroller Lab-Ms.K.S.Subhashini,Mr.S.Senthil Rajan,Dr.G.PAdmavathi/Dr.G.A.Sathishkumar","Medical Electronics/Robotics and Automation(E-1)-Ms.M.Anushya/Mr.S.P.Sivagnana Subramanian","Library-Ms.K.Srividhya"};

    String[] fleceaseven = {"RF and Microwave Engineering-MS.Sangeethapriya", "Optical Communication and Networks-Dr.P.Jothilakshmi", "Embedded and Real Time Systems-Mr.N.Kumaran", "Satellite Communication/Digital Image Processing(Elective-II)-Ms.K.Srividhya/Ms.D.Menaka", "Advanced Computer Architecture-Dr.G.A.Sathishkumar","Advanced Microprocessors and microcontrollers-Mr.P.Arul","Embedded Lab-Ms.S.M.Mehazabeen", "Optical and Microwave Lab-Mr.P.Muthukumaran,Ms.S.Sangeethapriya", "Library-Ms.S.Sangeethapriya", "Seminar-Ms Rajeswari Ramaraj,Mr.S.P.Sivagnana Subramanian,Mr.S.Senthil Rajan,Ms.S.Sangeethapriya"};

    String[] flecebthree = {"Mathematics III-Dr.D.Meiyappan", "Electrical Engineering and Instrumentation-Mr.T.Annamalai", "Programming and Data Structures-Ms.S.K.Umamaheswari", "Digital Electronics-Dr.S.Malathi", "Electromagnetic Fields-Ms.B.Hemalatha/Dr.H.Umma Habiba(T)", "Electronic Circuits-I-Mr.G.Loganathan", "Digital Electronics Lab-Dr.S.R.Malathi,Ms.L.Anju,Ms.S.Radhika", "Programming and Data Structures Lab-Ms.S.K.Umamaheswari", "Analog Circuits LAb-Ms.B.Hemalatha,Ms.M.Vidya,Mr.G.Loganathan","Library-Dr.H.Umma Habiba"};

    String[] flecebfive = {"Digital Communication-Ms.G.Padmavathi", "Principles of Digital Signal Processing-Ms.S.Kalyani,Ms.G.Padmavathi(T)", "Transmission Lines and Waveguides-Ms.K.Srividhya,Mr.S.Saravanan(T)", "Microprocessor and Microcontroller-Dr.S.Muthu Kumar", "Environmental Science and Engineering-Mr.R.Kalaivanan", "Digital Signal Processing Lab-Ms.D.Menaka,Ms.S.Kalyani,Ms.M.Vidya", "Communication System Lab-Mr.S.R.Balasubramanian,Mr.S.P.Sivagnana Subramanian,Ms B Hemalatha", "Microprocessor and Microcontroller Lab-Mr.M.Athappan,Ms.A.Bharathipriya,Mr.M.K.Varadarajan/Mr.R.Nagaraj","Medical Electronics/Robotics and Automation-Ms.M.Anushya/Mr.S.P.Sivagnana Subramanian","Library-Mr.S.Saravanan"};

    String[] flecebseven = {"RF and Microwave Engineering-Ms.C.Gomatheeswari Preethika", "Optical Communication and Networks-Dr.R.Gayathri", "Embedded and Real Time Systems-Ms.S.Reethi", "Satellite Communication-Ms.S.Radhika","Speech Processing-Ms.M.Vidya","Cognitive Radio-Dr.N.Kumaratharan", "Embedded Lab-Ms.R.Kousalya, Ms.S.Reethi", "Optical and Microwave Lab-Mr.S.Saravanan,Ms.C.Gomatheeswari Preethika", "Library-Ms.M.Vidya", "Seminar-Mr.P.Arul,Ms.A.Bharathipriya,Mr.S.Saravanan,Mr.B.Nethaji"};

    String[] flececthree = {"Mathematics III-Dr.R.Umadevi", "Electrical Engineering and Instrumentation-Ms.M.Rajalakshmi", "Programming and Data Structures-Ms.S.Poorani", "Digital Electronics-Mr.M.Athappan", "Electromagnetic Fields-Mr.M.H.Masood,Ms.Rajeswari Ramaraj(T)", "Electronic Circuits-I-Ms.B.Sarala", "Digital Electronics Lab-Mr.M.Athappan,Mr.N.Sathish/Mr.R.Nagaraj", "Analog Circuits Lab-Ms.B.Sarala,Mr.M.H.Masood,Ms.S.Sangeethapriya", "Programming and Data Structures Lab-Ms.S.Poorani,Ms.S.U.Muthunagai", "Library-Ms.Rajeswari Ramaraj"};

    String[] flececfive = {"Digital Communication-Ms.T.J.Jeyaprabha", "Principles of Digital Signal Processing-Ms.L.Anju,Dr.G.A.Sathishkumar(T)", "Transmission Lines and Waveguides-Mr.S.Saravanan,Mr.P.Muthukumaran(T)", "Microprocessor and Microcontroller-Ms.S.M.Mehazabeen", "Environmental Science and Engineering-Mr.S.Diravia Balan","Medical Electronics-Mr.R.Nagaraj","Digital Signal Processing Lab-Ms.L.Anju, Mr.P.Arul,Mr.G.Loganathan,Mr.N.Kumaran", "Communication System Lab-Ms.T.J.Jeyaprabha,Ms.S.Radhika,Ms.C.Gomatheeswari Preethika", "Microprocessor and Microcontroller Lab-Mr.S.Saravanan,Mr.M.K.Varadarajan,Ms.S.Reethi/Dr.N.Kumaranathan", "Library-Mr.P.Muthukumaran"};

    String[] flececseven = {"RF and Microwave Engineering-Dr.H.Umma Habiba", "Optical Communication and Networks-Mr.S.SenthilRajan", "Embedded and Real Time Systems-Mr.N.Sathish", "Satellite Communication/Digital Image Processing(Elective-II)-Ms.K.Srividhya/Mr.S.P.Sivagnana Subramanian", "Advanced Computer Architecture(Elective-III)-Ms.A.Bharathipriya", "Advanced Microprocessors and Microcontrollers(Elective-IV)-Ms.S.KAlyani", "Embedded Lab-Mr.N.Sathish,Ms.A.Bharathipriya", "Optical and Microwave Lab-Ms.K.Srividhya,Mr.M.H.Mahood", "Library-Ms.S.Kalyani"};

    String[] fleeeathree = {"Mathematics-III-Ms.K.Vijayalakshmi", "Electronic Devices and Circuits-Ms.M.Maadhuri", "Electromagnetic Theory-Mr.S.Thamizhmani", "Electrical Machines-I-MS.K.Suganthi", "Programming and Data Structures-Ms.N.Uma", "Measurements and Instrumentations-Mr.C.Kamal", "Electrical Machines-I Lab-Ms.K.Suganthi,Mr.S.V.Sreeraj,Dr.S.G.Bharathidasan/Mr.S.Kumaravel", "Electronic Devices and Circuits Lab-Ms.M.Maadhuri,Ms.M>Sasikala", "Programming and Data Structures Lab-Ms.N.Uma,Ms.R.Saktheeswari"};

    String[] fleeeafive = {"Power System Analysis-Mr.M.Sankar","Design of Electrical Apparatus-Dr.Nalin Kant Mohanty","Microprocessors and Microcontrollers-Ms.D.Amudhavalli", "Power Plant Engineering-Mr.S.Arumugam", "Power Electronics-Mr.I.Venkatraman","Power Electronics LAb-Mr.I.Venkatraman(I/C),Mr.T.Annamalai","Microprocessor and microcontroller lab-Ms.D.Amudhavalli(I/C),Mr.D.S.Purushothaman","Library-Mr.S.Sudharsanam","Seminar-Mr.C.Venkatesan(M),Mr.M.Rajvikram(F)"};

    String[] fleeeaseven = {"High Voltage Engineering-Mr.C.Kamal", "Protection and Switchgear-Mr.C.Venkatesan", "Special Electrical Machines-Ms.S.Arulmozhi", "Principles of Management-Dr.R.Karthikeyan", "Bio-Medical Instrumentation(E-II)-Dr.C.Gopinath", "Fundamentals of Nanoscience(E-III)-Ms.S.Anitha","Power System Simulation Lab-Dr.C.Gopinath(I/C),Mr.C.Kamal", "Comprehension-Dr.Sudhakar K Bharathan,Ms.S.Arulmozhi,Ms.K.S.Pavithra,Mr.S.S.Sethuraman,Mr.S.V.Sreeraj,Dr.Nalinkanth Mohanty", "Soft Skills Training-Mr.G.Vinothkumar,Mr.C.Kamal,Ms.K.Suganthi", "Central Library-Ms.D.Amudhavalli", "Seminar-Dr.C.Gopinath"};

    String[] fleeebthree = {"Mathematics-III-Ms N.S.Priya", "Electronic Devices and Circuits-Ms.S.Anitha", "Electromagnetic Theory-Dr.Sudhakar K Bharathan", "Electrical Machines-I-Mr.V.Mohanraj", "Programming and Data Structures-Ms.K.Nivethashree", "Measurements and Instrumentations-Mr.A.Thamizhselvan", "Electrical Machines-I Lab-Ms.S.Arulmozhi,Mr.V.Mohanraj,Mr.S.S.Sethuraman", "Electronic Devices and Circuits Lab-Ms.S.Anitha/Ms.K.S.Pavithra", "Programming and Data Structures Lab-Ms.K.Nivethashree,Mr.V.Ranjith"};

    String[] fleeebfive = {"Power System Analysis-Mr.M.Rajvikram","Design of Electrical Apparatus-MR.G.Vinothkumar","Microprocessors and Microcontrollers-Dr.S.G.Bharathidasan", "Power Electronics-Mr.A.Thamizhselvan", "Total quality Management-Mr.S.Thamizhmani", "Environmental Science and Engineering-Ms.P.G.Priyadharshini", "Power Electronics Lab-Mr.A.Thamizhselvan(I/C)/MR.m>Rajvikram", "Microprocessor and microcontroller Lab-Ms.M>Sasikala,Ms.N.Shanmugavadivu", "Library-Mr.A.Thamizhselvan","Seminar-Ms.M.Maadhuri(T),Ms.S.Arulmozhi(TH)"};

    String[] fleeebseven = {"High Voltage Engineering-Dr.K.Sundararaman", "Protection and Switchgear-Dr.K.Kannadasan", "Special Electrical Machines-Ms.N.Shanmugavadivu", "Principles of Management-Dr.R.Karthikeyan", "Bio-Medical Instrumentation(E-II)-Mr.D.S.Purushothaman", "Fundamentals of Nanoscience(E-III)-Ms.M.Sasikala", "Power System Simulation Lab-Mr.R.Kannadasan,Mr.C.Venkatesan", "Comprehension-Dr.C.Gopinath,Mr.S.Kumaravel/Dr.K.Sundararaman,Mr.S.Thamizhmani,Mr.S.Kumaravel", "Soft Skills Training-Ms.S.Sinthamani,Dr.R.Karthikeyan", "Central Library-Mr.D.Purushothaman", "Seminar-Mr.S.Thamizhmani"};

    String[] flitathree = {"Mathematics III-Ms.Visalakshi Subramanian", "Programming and Data Structures II-MR.E.Sivakumar", "Operating Systems-Mr.T.Sukumar", "Computer Organization and Architecture-Mr.V.Ranjith", "Analog and Digital Communication-Mr.K.Suresh", "Environmental Science and Engineering-Mr.G.Arun", "Programming and Data Structures Lab II-Mr.E.Sivakumar,Mr.E.Sakthivel", "Operating Systems Lab-Mr.T.Sukumar,Dr.C.Yaashuwanth", "Analog and Digital Communication Lab-Mr.V.Rajaram,Mr.K.Suresh", "Library-Ms.Kiruba Wesley"};

    String[] flitafive = {"Computer Networks-Ms.P.Nirmala", "Graphics and Multimedia-Ms.A.Kala", "Object Oriented Analysis and Design-Mr.S.Uvaraj Arutkumaran", "Digital Signal Processing-Ms.K.S.Pavithra,Mr.S.S.Sethuraman(T)", "Web Programming-Ms.J.Sharon Ranjitha Esther", "Computational Intelligence-Ms.N.Uma,Ms.P.Sharon Femi(T)", "Networks Lab-Ms.P.Nirmala,Ms.R.Saktheeswari,Ms.C.Silambarasi", "Web Programming Lab-Ms.J.Sharon Ranjitha Esther,Ms.C.Silambarasi", "Case Tools Lab-Ms.S.Jerusha,Mr.S.Uvaraj Arutkumaran"};

    String[] flitaseven = {"Information Management-Dr.G.Sumathi", "Cryptography and Network Security-Mr.A.R.Guru Gokul", "Data Ware Housing and Data Mining-Dr.V.Vidhya", "Grid and Cloud Computing-Ms.G.Sangeetha", "Software Testing(E-II)-Ms.C.Silambarasi", "Data Mining Lab-Ms.G.Sangeetha,Ms.V.M.Megala,Ms.P.Sharon Femi,Ms.B.T.Shobana", "Security Lab-Mr.A.R.Guru Gokul,Ms.V.M.Megala", "Grid and Cloud Computing Lab-Ms.D.Jayanthi,Ms.G.Sangeetha,Ms.A.Indumathi", "Library-Mr.S.Uvaraj Arutkumaran", "Seminar-Ms.S.Jerusha,Ms.B.T.Shobana,Ms.A.Kala,MsKiruba Wesley,Ms.N.Devi"};

    String[] flitbthree = {"Mathematics III-Ms.K.Vijayalakshmi", "Programming and Data Structures II-Ms.B.T.Shobana", "Operating Systems-Ms.A.Rohini", "Computer Organization and Architecture-Dr.C.Yaashuwanth", "Analog and Digital Communication-Mr.V.Rajaram", "Environmental Science and Engineering-Dr.A.Bhaskaran", "Programming and Data Structures Lab II-Ms.A.Kala,Ms.B.T.Shobana", "Operating Systems Lab-Ms.A.Rohini, Ms.S.Kalavathi", "Analog and Digital Communication Lab-Mr.K.Suresh,Mr.V.Rajaram", "Library-Ms.K.Nivethashree"};

    String[] flitbfive = {"Computer Networks-Ms.R.Saktheeswari", "Graphics and Multimedia-Ms.S.Jerusha", "Object Oriented Analysis and Design-Ms.Kiruba Wesley", "Digital Signal Processing-Mr.S.S.Sethuraman,Ms.K.S.Pavithra(T)", "Web Programming-Ms.S.Kalavathi", "Computational Intelligence-Ms.P.Sharon Femi,Ms.N.Uma(T)", "Networks Lab-Ms.U.Pooranima,Ms.R.Saktheeswari,Ms.P.Nirmala,Ms.C.Silambarasi", "Web Programming Lab-Ms.S.Kalavathi,Ms.A.Rohini", "Case Tools Lab-Ms.Kiruba Wesley,Ms.A.Indumathi"};

    String[] flitbseven = {"Information Management-Mr.A.Indumathi", "Cryptography and Network Security-Ms.V.M.Sivagami", "Data Ware Housing and Data Mining-Mr.T.Sukumar", "Grid and Cloud Computing-Ms.D.Jayanthi", "Software Testing(E-II)-Ms.V.M.Megala", "Data Mining Lab-Ms.B.T.Shobana,Ms.P.Sharon Femi,Mr.T.Sukumar", "Security Lab-Ms.P.Nirmala,Ms.V.M.Sivagami", "Grid and Cloud Computing Lab-Ms.D.JAyanthi,Ms.A.Indumathi/Ms.G.Sangeetha", "Library-Ms.V.Saroja", "Seminar-Mr.T.Sukumar,Dr.C.Yaashuwanth,Ms.P.Leela Rani,Ms.B.T.Shoabana"};

    String[] flmechathree = {"Mathematics III-Dr.R.Suresh", "Engineering Thermodynamics-Dr.K.Pithcandi/Mr.G.Suresh", "Manufacturing Technology I-Dr.S.Ramesh Babu", "Engineering Materials and Metallurgy-Dr.M.Mohandass", "Mechanics of Solids-Mr.M.Maheswaran/Dr.G.Saravanan", "Electrical Drives and Controls-Mr.S.Sudharasanam", "Manufacturing Technology Lab I-Dr.M.Ananthkumar(M&F)/Mr.S.Yeshwanth Raj(M&F)/Mr.G.Ganesan(W),Mr.K.Ramprasad(w)", "Strength of Materials Lab-Dr.M.Mohandass/Mr.G.Suresh", "Electrical Engineering Lab-Mr.S.Sudharasanam/Ms.D.Amudhavalli/Ms.N.Shanmugavadivu"};

    String[] flmechafive = {"Computer Aided Design-Mr.M.Arulkumar", "Heat and Mass Transfer-Mr.R.Kaliyanasunder/Dr.P.Raghu", "Design of Machine Elements-Dr.T.Raja/Dr.R.Ramesh", "Metrology and Measurements-Dr.M.Ananthkumar", "Dynamics of Machines-Mr.J.Sivaramapandian/Mr.C.Senthmaraikannan", "Professional Ethics in Engineering-Mr.S.Muniraj", "Dynamics Lab-Mr.Sivaramapandian/E.Suresh/Mr.M.Arulkumar", "Thermal Engineering Lab II-Mr.R.Kaliyanasunder/Mr.M.Gajendiran(Wed)/Mr.S.Arumugam(Mon)", "Metrology and Measurements Lab-Dr.S.Ponnuvel/Dr.V.Sridharan"};

    String[] flmechaseven = {"Power Plant Engineering-Mr.G.Suresh", "Mechatronics-Mr.M.Arul Kumar", "Computer Integrated Manufacturing System-Mr.S.Muniraj", "Total Quality Management-Mr.K.Ram Prasad", "Process Planning and Cost Estimation-Mr.V.Senthilvelan", "Welding Technology-Dr.M.Ananth Kumar", "Robotics-Dr.K.S.Badrinathan", "Maintenance Engineering-Mr.M.Nishal", "Simulation and Analysis Lab-Mr.M.Maheswaran(Mon)/Mr.M.Nishal(M)/Mr.R.Ganesan", "Mechatronics Lab-Mr.S.Gopinath/Mr.M.Arulkumar", "Comprehension-Mr.S.Natarajan/Mr.V.Senthilvelan", "Placement training-DR.KSB,Dr.MMD,MR.K.Ram,MR.MN(T1),Dr.NMK,Dr.MAK,Mr.MKM,Mr.MB(T2)", "Library-Mr.G.Suresh"};

    String[] flmechbthree = {"Mathematics III-Dr.R.Uma Devi", "Engineering Thermodynamics-Dr.S.Saravanan/Mr.S.Arumugam", "Manufacturing Technology I-Dr.N.Muthu Krishnan", "Engineering Materials and Metallurgy-Dr.V.Sridharan", "Mechanics of Solids-Mr.G.Saravanaram/Mr.M.Maheswaran", "Electrical Drives and Controls-Mr.M.Ranjith Kumar", "Manufacturing Technology Lab I-Dr.M.Ananth Kumar,Mr.M.Balakumar,Mr.G.Saravanaram,Mr.K.Ramprasad/Mr.S.Yeshwanth Raj", "Strength of Materials Lab-Mr.Muniraj/Mr.G.Logachandar", "Electrical Engineering Lab-Mr.M.Ranjith Kumar/Mr.D.S.Purushothaman/Mr.S.Sudharsanam"};

    String[] flmechbfive = {"Computer Aided Design-Mr.G.Kirubakaran", "Heat and Mass Transfer-Dr.P.Raghu/Mr.R.Kaliyanasundaram", "Design of Machine Elements-Dr.R.Ramesh/Dr.T.Raja", "Metrology and Measurements-Dr.S.Ilaiyavel", "Dynamics of Machines-Mr.C.Senthamarai Kannan/Mr.J.Sivaramapandian", "Principles of Management-Mr.M.Balakumar", "Dynamics Lab-Dr.C.Senthamarai KAnnan/Mr.E.Suresh", "Thermal Engineering Lab II-Dr.P.Raghu/Dr.M.Gajendran", "Metrology and Measurements Lab-Dr.S.Ilaiyavel/Mr.M.Kalaimani"};

    String[] flmechbseven = {"Power Plant Engineering-Mr.S.Natarajan", "Mechatronics-Mr.A.Kumaraswamy", "Computer Integrated Manufacturing System-Dr.S.Ponnuvel", "Total Quality Management-Mr.S.Gopinath", "Process Planning and Cost Estimation-Mr.S.Yeshwanthraj", "Welding Technology-Dr.M.Ananth Kumar", "Robotics-Dr.K.S.Badrinathan", "Maintenance Engineering-Mr.K.Karthee", "Simulation and Analysis Lab-Mr.G.Kirubakaran/Mr.G.Saravanan/Dr.T.Raja)", "Mechatronics Lab-Mr.A.Kumaraswamy/Mr.K.Karthee", "Comprehension-Dr.P.Raghu(Fri)/Mr.K.Karthee", "Placement training-DR.R.R,Dr.C.S.K,Dr.V.S,Mr.R.G(T3),Dr.T.R.,Dr.S.P,Mr.A.K.S,Mr.SYR(T4)", "Library-Mr.G.Suresh"};

    String[] flmarinethird={"Mathematics-III-Ms.K.Vijayalakshmi","Marine Hydraulics and Fluid Machinery-Mr.G.Rameshkannan","Seamanship,Elementary Navigation and Survival at sea-Prof.S.Krishnan/Mr.R.Karthic Kumar","Marine Manufacturing Technology-Mr.V.Gurusamy","Marine Electrical Machines-I-Ms.S.Sinthamani","Marine Steam Engines-Dr.M.Anandan","Marine Machinery Drawing-Mr.J.Arun Chakkaravarthy/Mr.M.Karnam Dileep","Marine Hydraulics and Fluid Machinery Laboratory-Mr.G.Rameshkannan/Mr.S.G.Karthik","Welding Techniques,Lathe and Special M/C Shop-Mr.V.Karnam Dileep/Mr.V.Gurusamy","Library-Mr.J.Arun Chakravarthy"};

    String[] flmarinefive={"Marine Auxiliary Machinery-I-Prof.K.V.Sivanarayana","Marine Diesel Engine-Prof.T.R.Mohan","Ship construction-B.Srivathsan","Mechanics of Marine Machines-Mr.Karnam Dileep/Mr.J.Arun Xhakkravarthy(T)","Marine Electronics-Prof.S.Ganesh Vaidyanathan","Electricsal Engineering,Electronics and Microprocessor Laboratory-Mr.S.Sinthamani,Mr.S.Kumaravel/Ms.D.Menaka,Ms.T.Jeyaprabha","Measurement,Instrumentation & Refrigeration Laboratory-Mr.J.Arun Chakkaravarthy/G.Rameshkannan","Marine Propulsion and Auxiliary Machineries Overhauling lab-Prof.T.R.Mohan/Mr.R.Karthic Kumar","Library-Mr.Karnam Dileep/Mr.B.Srivathsan/Mr.S.G.Karthik"};

    String[] flmarineseven={"Marine System and Machinery Design-Mr.R.Karthic Kumar","Marine Electrical Technology-Mr.S.Kumaravel","Marine Vehicles Performance-Mr.B.Srivathsan","Marine Auxiliary Machinery-II-Prof.K.V.Sivanarayana","Ship's Fire Prevention and Control-Prof.T.R.Mohan","Advanced Marine Heat Engines-Dr.M.Anandan","Fire Fighting,Controls and Simulator Laboratory-Prof.S.Krishnan","Marine Propulsion and Auxiliary Machineries Overhaauling Laboratory-Prof.K.V.Sivanarayana/Mr.R.Karthic Kumar","Communication and Soft Skills Laboratory based-Mr.P.Ganapathy","Library-Mr.G.Rameshkannan/Mr.V.Gurusamy","Training Assessment Record-Mr.M.Anandan"};


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttperiod);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");

        t = extras.getInt("sec");
        d = extras.getInt("day");
        listView = (ListView) findViewById(R.id.period);


        listView.setAdapter(new ArrayAdapter<String>(teacherlist.this, android.R.layout.simple_list_item_1, new ArrayList<String>()));

        if (x!= 0) {


            switch (z) // getting the valuefor depatrmnt
            {
                case 1:// automobile
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflautotwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflautofour().execute();
                                        break;
                                    case 6:
                                        new Asyncflautosix().execute();
                                        break;
                                    case 8:
                                        new Asyncflautoeight().execute();
                                        break;


                                }

                            } else {

                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflautoone().execute();
                                        break;
                                    case 3:
                                        new Asyncflautothree().execute();
                                        break;
                                    case 5:
                                        new Asyncflautofive().execute();
                                        break;
                                    case 7:
                                        new Asyncflautoseven().execute();
                                        break;


                                }

                            }
                        }
                        break;
                    }
                }
                break;

                case 2: // biotech
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflbiotechtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflbiotechfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflbiotechsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflbiotecheight().execute();
                                        break;


                                }
                            } else {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflbiotechone().execute();
                                        break;
                                    case 3:
                                        new Asyncflbiotechthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflbiotechfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflbiotechseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                    }

                    break;
                }

                case 3: // chemical
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflchematwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflchemafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflchemasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflchemaeight().execute();
                                        break;

                                }


                            } else {

                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                                switch (y) {
                                    case 1:
                                        new Asyncflchemaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflchemathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflchemafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflchemaseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflchembtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflchembfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflchembsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflchembeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflchembone().execute();
                                        break;
                                    case 3:
                                        new Asyncflchembthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflchembfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflchembseven().execute();
                                        break;


                                }


                            }

                        }
                        break;
                    }

                    break;
                }
                case 4: // civil
                {

                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflciviltwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcivilfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcivilsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcivileight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflcivilone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcivilthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcivilfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcivilseven().execute();
                                        break;


                                }


                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: //eee
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleeeatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleeeafour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleeeasix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleeeaeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleeeaone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleeeathree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleeeafive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleeeaseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleeebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleeebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleeebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleeebeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleeebone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleeebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleeebfive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleeebseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                    }
                    break;

                }
                case 6: // it
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflitatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflitafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflitasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflitaeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflitaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflitathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflitafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflitaseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflitbtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflitbfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflitbsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflitbeight().execute();
                                        break;

                                }

                            } else {


                                switch (y) {
                                    case 1:
                                        new Asyncflitbone().execute();
                                        break;
                                    case 3:
                                        new Asyncflitbthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflitbfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflitbseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                    }
                    break;
                }
                case 7://ece
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //  Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleceatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleceafour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleceasix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleceaeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleceaone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleceathree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleceafive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleceaseven().execute();
                                        break;


                                }
                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {

                                // Toast.makeText(facultyadv.this, "Teacher list not available ", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflecebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflecebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflecebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflecebeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflecebone().execute();
                                        break;
                                    case 3:
                                        new Asyncflecebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflecebfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflecebseven().execute();
                                        break;


                                }

                            }
                            break;
                        }
                        case 3: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflecectwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflececfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflececsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflececeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflececone().execute();
                                        break;
                                    case 3:
                                        new Asyncflececthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflececfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflececseven().execute();
                                        break;

                                }

                            }
                            break;

                        }

                    }
                    break;
                }
                case 8: // cse
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcseatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcseafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcseasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcseaeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflcseaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcseathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcseafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcseaseven().execute();
                                        break;

                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcsebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcsebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcsebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcsebeight().execute();
                                        break;

                                }


                            } else {
                                switch (y) {
                                    case 1:
                                        new Asyncflcsebone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcsebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflbiotechfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflbiotechseven().execute();
                                        break;

                                }


                            }
                            break;
                        }
                        case 3: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcsectwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcsecfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcsecsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcseceight().execute();
                                        break;

                                }

                            } else {
                                switch (y) {
                                    case 1:
                                        new Asyncflcsecone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcsecthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcsecfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcsecseven().execute();
                                        break;

                                }


                            }
                            break;

                        }

                    }
                    break;

                }
                case 9:  // mech
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmechatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmechafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmechasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmechaeight().execute();
                                        break;

                                }
                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflmechaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmechathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmechafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmechaseven().execute();
                                        break;
                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmechbtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmechbfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmechbsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmechbeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflmechbone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmechbthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmechbfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmechbseven().execute();
                                        break;
                                }


                            }
                            break;
                        }

                    }
                    break;

                }
                case 10: // marine
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmarinetwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmarinefour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmarinesix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmarineeight().execute();
                                        break;


                                }
                            } else {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflmarineone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmarinethree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmarinefive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmarineseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                    }

                    break;
                }
            }

        }
    }

    //marine

    public class Asyncflmarineone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarineone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarinethree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinethird) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarinefive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinefive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarineseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarineseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


  //marine even semesters
  public class Asyncflmarinetwo extends AsyncTask<Void, String, String> {

      ArrayAdapter<String> arrayAdapter;
      ProgressBar progressBar;
      int count;

      @Override
      protected void onPreExecute() {
          super.onPreExecute();

          arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
          progressBar = (ProgressBar) findViewById(R.id.progressBart);
          progressBar.setMax(10);
          progressBar.setProgress(0);
          progressBar.setVisibility(View.VISIBLE);
          count = 0;

      }

      @Override
      protected String doInBackground(Void... voids) {

          for (String value : flmarinetwo) {
              publishProgress(value);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
          return "Added successfully";
      }

      @Override
      protected void onProgressUpdate(String... values) {
          super.onProgressUpdate(values);

          arrayAdapter.add(values[0]);
          count++;
          progressBar.setProgress(count);
      }

      @Override
      protected void onPostExecute(String s) {
          super.onPostExecute(s);

          progressBar.setVisibility(View.INVISIBLE);
      }
  }

    public class Asyncflmarinefour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinefour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarinesix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinesix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarineeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarineeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }











    public class Asyncflautoone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflautotwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautotwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflchematwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchematwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflciviltwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flciviltwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsectwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsectwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecectwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecectwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflautofour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautofour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautosix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautosix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautoeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotecheight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotecheight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivileight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivileight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseceight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseceight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    //odd sem asynctask

    public class Asyncflautothree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautothree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautofive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautofive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautoseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


}










