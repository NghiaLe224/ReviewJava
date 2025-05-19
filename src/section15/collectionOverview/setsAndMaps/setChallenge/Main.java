package section15.collectionOverview.setsAndMaps.setChallenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = new HashSet<>(TaskData.getTasks("All"));
        sortAndPrint("All Task: ", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = new HashSet<>(TaskData.getTasks("Ann"));
        sortAndPrint("Ann's Task: ", annsTasks, sortByPriority);

        //TAT CA cac task
        //Task da duoc assign cho it nhat 1 nguoi
        //Task van can duoc assign
        //Task da duoc assign cho nhieu nguoi

        //Tao 3 methods - khong anh huong toi Set cu (return ra set moi)
        //tao method getUnion nhan List of Sets va tra ra union cua cac Sets -- (Union la hop nhat bo di phan tu chung) -- addAll
        //tao method getIntersect nhan 2 Sets va tra ve intersection of the sets -- (Intersection la chi giu lai phan tu chung) retainAll()
        //tao method getDifference nhan 2 Sets va remove Set thu 2 tu set 1 -- (Difference loai bo giong tu phan B khoi A) -- removeAll()

        Set<Task> bobsTask = TaskData.getTasks("Bob");
        Set<Task> carolsTask = TaskData.getTasks("Carol");
        List<Set<Task>> sets = List.of(annsTasks, bobsTask, carolsTask);

        List<Set<Task>> assignedList = List.of(annsTasks, bobsTask, carolsTask);
        Set<Task> assignedTasks = getUnion(assignedList);
        sortAndPrint("Assigned Task", assignedTasks);

        Set<Task> everyTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("Every Task", everyTask);

        Set<Task> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("Missing Tasks", missingTasks);

        Set<Task> unAssignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unAssignedTasks, sortByPriority);

        Set<Task> overlap = getUnion(List.of(
            getIntersect(annsTasks, bobsTask),
            getIntersect(annsTasks, carolsTask),
            getIntersect(bobsTask, carolsTask)
        ));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

         List<Task> overlapping = new ArrayList<>();
         for(var set : sets){
            Set<Task> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
         }

         Comparator<Task> priorityNatural = sortByPriority.thenComparing(Comparator.naturalOrder());
         sortAndPrint("Overlapping", overlapping, priorityNatural);



    }
//    private static Set<Task> getAllTask(Set<Task> a, Set<Task> b, Set<Task> c, Set<Task> d){
//        List<Set<Task>> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(d);
//        return getUnion(list);
//    }
//
//    private static Set<Task> assignedTask(Set<Task> allTask, Set<Task> b, Set<Task> c, Set<Task> d){
//        Set<Task> bsTask = getIntersect(allTask, b);
//        Set<Task> csTask = getIntersect(allTask, c);
//        Set<Task> dsTask = getIntersect(allTask, d);
//        List<Set<Task>> list = new ArrayList<>();
//        list.add(bsTask);
//        list.add(csTask);
//        list.add(dsTask);
//        return getUnion(list);
//    }
//
//    private static Set<Task> needToAssigned (Set<Task> allTask, Set<Task> b, Set<Task> c, Set<Task> d){
//        List<Set<Task>> list = new ArrayList<>();
//        list.add(b);
//        list.add(c);
//        list.add(d);
//        Set<Task> unionTask = getUnion(list);
//        Set<Task> assignedTask = assignedTask(allTask, b, c, d);
//        unionTask.removeAll(assignedTask);
//        return unionTask;
//    }
//
//    private static Set<Task> assignedMul(Set<Task> allTask, Set<Task> b, Set<Task> c, Set<Task> d){
//
//        return
//    }

    private static Set<Task> getUnion(List<Set<Task>> list){
        Set<Task> unionTask = new HashSet<>();
        for(Set<Task> s : list){
            unionTask.addAll(s);
        }
        return unionTask;
    }

    private static Set<Task> getIntersect(Set<Task> a, Set<Task> b){
        Set<Task> intersectSet = new HashSet<>(a);
        intersectSet.retainAll(b);
        return intersectSet;
    }

    private static Set<Task> getDifference (Set<Task> a, Set<Task> b){
        Set<Task> diffSet = new HashSet<>(a);
        diffSet.removeAll(b);
        return diffSet;
    }

    private static void sortAndPrint(String header, Collection<Task> collection){
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter){
        String separator = "-".repeat(90);
        System.out.println(separator);
        System.out.println(header);
        System.out.println(separator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }
}
